package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayBillManagerTest {
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
  public void testFindAll() {
    PlaybillManager allPosters = new PlaybillManager();
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);
    allPosters.save(poster6);
    allPosters.save(poster7);
    allPosters.save(poster8);
    allPosters.save(poster9);
    allPosters.save(poster10);
    allPosters.save(poster11);

    PlaybillPoster[] expectedArray = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};

    Assertions.assertArrayEquals(expectedArray, allPosters.findAll());
  }

  @Test
  public void test() { // Если дефолтный лимит и фильмов больше
    PlaybillManager allPosters = new PlaybillManager();
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);
    allPosters.save(poster6);
    allPosters.save(poster7);
    allPosters.save(poster8);
    allPosters.save(poster9);
    allPosters.save(poster10);
    allPosters.save(poster11);


    PlaybillPoster[] expectedArray = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};

    Assertions.assertArrayEquals(expectedArray, allPosters.findLast());
  }

  @Test
  public void testFindLastIfArrayLowThanDefaultLimit() { // Если дефолтный лимит и фильмов меньше
    PlaybillManager allPosters = new PlaybillManager();
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);


    PlaybillPoster[] expectedArray = {poster5, poster4, poster3, poster2, poster1};

    Assertions.assertArrayEquals(expectedArray, allPosters.findLast());
  }

  @Test
  public void testFindLastCustomLimit5() { // Если лимит меньше количества фильмов в менеджере
    PlaybillManager allPosters = new PlaybillManager(5);
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);
    allPosters.save(poster6);
    allPosters.save(poster7);
    allPosters.save(poster8);
    allPosters.save(poster9);
    allPosters.save(poster10);
    allPosters.save(poster11);

    PlaybillPoster[] expectedArray = {poster11, poster10, poster9, poster8, poster7};

    Assertions.assertArrayEquals(expectedArray, allPosters.findLast());
  }

  @Test
  public void testFindLastCustomLimitEqualArray() { // Если лимит равен количеству фильмов в менеджере
    PlaybillManager allPosters = new PlaybillManager(11);
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);
    allPosters.save(poster6);
    allPosters.save(poster7);
    allPosters.save(poster8);
    allPosters.save(poster9);
    allPosters.save(poster10);
    allPosters.save(poster11);

    PlaybillPoster[] expectedArray = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};

    Assertions.assertArrayEquals(expectedArray, allPosters.findLast());
  }

  @Test
  public void testFindLastIfArrayLowThanLimit() { //Если лимит больше чем фильмов в менеджере
    PlaybillManager allPosters = new PlaybillManager(11);
    allPosters.save(poster1);
    allPosters.save(poster2);
    allPosters.save(poster3);
    allPosters.save(poster4);
    allPosters.save(poster5);


    PlaybillPoster[] expectedArray = {poster5, poster4, poster3, poster2, poster1};

    Assertions.assertArrayEquals(expectedArray, allPosters.findLast());
  }
}
