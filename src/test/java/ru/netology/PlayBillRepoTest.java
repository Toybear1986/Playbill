package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;

public class PlayBillRepoTest {

  PlaybillRepository mock = Mockito.mock(PlaybillRepository.class);

  PlaybillPoster poster1 = new PlaybillPoster("link1", "Test1", "Боевик", false, 1);
  PlaybillPoster poster2 = new PlaybillPoster("link2", "Test2", "Боевик", false, 2);
  PlaybillPoster poster3 = new PlaybillPoster("link3", "Test3", "Боевик", false, 3);
  PlaybillPoster poster4 = new PlaybillPoster("link4", "Test4", "Боевик", false, 4);
  PlaybillPoster poster5 = new PlaybillPoster("link5", "Test5", "Боевик", false, 5);
  PlaybillPoster poster6 = new PlaybillPoster("link6", "Test6", "Боевик", false, 6);
  PlaybillPoster poster7 = new PlaybillPoster("link7", "Test7", "Боевик", false, 7);
  PlaybillPoster poster8 = new PlaybillPoster("link8", "Test8", "Боевик", false, 8);
  PlaybillPoster poster9 = new PlaybillPoster("link9", "Test9", "Боевик", false, 9);
  PlaybillPoster poster10 = new PlaybillPoster("link10", "Test10", "Боевик", false, 10);
  PlaybillPoster poster11 = new PlaybillPoster("link11", "Test11", "Боевик", false, 11);

  @Test
  public void test() {
    PlaybillRepository repo = new PlaybillRepository();
    repo.save(poster1);
    repo.save(poster2);
    repo.save(poster3);
    repo.save(poster4);
    repo.save(poster5);
    repo.save(poster6);
    repo.save(poster7);
    repo.save(poster8);
    repo.save(poster9);
    repo.save(poster10);
    repo.save(poster11);

    PlaybillPoster[] expectedObverse = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
    Assertions.assertArrayEquals(expectedObverse, repo.findAll());

    repo.removeById(poster11.getId());
    PlaybillPoster[] expectedArrayWithout11 = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10};
    Assertions.assertArrayEquals(expectedArrayWithout11, repo.getItems());

    PlaybillPoster expectedPoster = poster3;
    Assertions.assertEquals(expectedPoster, repo.findById(3));

    repo.removeAll();
    PlaybillPoster[] emptyArray = {};
    Assertions.assertArrayEquals(emptyArray, repo.getItems());

    Assertions.assertEquals(null, repo.findById(12));
  }

  @Test
  public void NullExceptions() {
    doReturn(null).when(mock).findById(12); //Пробуем поискать несуществующий Id
    doNothing().when(mock).removeById(4); // Пробуем удалить из пустого массива
  }
}
