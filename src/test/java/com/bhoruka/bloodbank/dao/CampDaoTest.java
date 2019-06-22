package com.bhoruka.bloodbank.dao;

import com.bhoruka.bloodbank.dao.repository.CampRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CampDaoTest {

    @Mock
    private CampRepository campRepository;

    @InjectMocks
    private CampDao campDao;

    @Before
    public void init() {
        campDao = new CampDao(campRepository);
    }

    @Test(expected = NullPointerException.class)
    public void constructor_nullValue_throwsNullPointerException() {
        campDao = new CampDao(null);
    }
}
