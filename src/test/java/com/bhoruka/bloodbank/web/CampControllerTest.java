package com.bhoruka.bloodbank.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.bhoruka.bloodbank.TestConstants;
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
        when(campService.createCamp(any())).thenReturn(TestConstants.TEST_CAMP_ID);

        assertThat(campController.createCamp(TestConstants.CREATE_CAMP_REQUEST),
                is(TestConstants.CREATE_CAMP_RESPONSE));
    }

    @Test
    public void createCamp_returnsNullValue() {
        when(campService.createCamp(any())).thenReturn(null);

        assertThat(campController.createCamp(TestConstants.CREATE_CAMP_REQUEST),
                is(nullValue()));
    }
}
