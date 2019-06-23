package com.bhoruka.bloodbank.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.bhoruka.bloodbank.TestCampConstants;
import com.bhoruka.bloodbank.exception.CampCreationFailedException;
import com.bhoruka.bloodbank.service.CampService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CampControllerTest {

    @Mock
    private CampService campService;

    @InjectMocks
    private CampController campController;

    @Before
    public void setup() {
        campController = new CampController(campService);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_nullValue_throwsNullPointerException() {
        campController = new CampController(null);
    }

    @Test
    public void createCamp_success() {
        when(campService.createCamp(any())).thenReturn(TestCampConstants.TEST_CAMP_ID);

        assertThat(campController.createCamp(TestCampConstants.CREATE_CAMP_REQUEST),
                is(TestCampConstants.CREATE_CAMP_RESPONSE));
    }

    @Test
    public void createCamp_() {
        when(campService.createCamp(any()))
                .thenThrow(new CampCreationFailedException(TestCampConstants.NULL_CAMP_ID_ERROR_MESSAGE));

        assertThat(campController.createCamp(TestCampConstants.CREATE_CAMP_REQUEST),
                is(TestCampConstants.CREATE_CAMP_NULL_ID_ERROR_RESPONSE));
    }
}
