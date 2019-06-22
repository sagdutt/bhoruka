package com.bhoruka.bloodbank.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.bhoruka.bloodbank.dao.CampDao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

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
        assertThat(campService.createCamp(), is("campId"));
    }
}
