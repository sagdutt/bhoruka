package com.bhoruka.bloodbank.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import com.bhoruka.bloodbank.TestConstants;
import com.bhoruka.bloodbank.dao.CampDao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CampServiceTest {

    @Mock
    private CampDao campDao;

    @InjectMocks
    private CampService campService;

    @Before
    public void setup() {
        campService = new CampService(campDao);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_nullValue_throwsNullPointerException() {
        campService = new CampService(null);
    }

    @Test
    public void createCamp_success() {
        when(campDao.createCamp(ArgumentMatchers.any())).thenReturn(TestConstants.VALID_CAMP_MODEL);

        assertThat(campService.createCamp(TestConstants.CREATE_CAMP_REQUEST), is(TestConstants.TEST_CAMP_ID));
    }

    @Test(expected = NullPointerException.class)
    public void createCamp_nullValue_throwsNullPointerException() {
        campService.createCamp(null);
    }
}
