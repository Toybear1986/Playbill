package ru.netology;

public class PlaybillManager {

  protected int limit = 10;
  private PlaybillRepository repo;

  protected PlaybillManager() {
  }

  protected PlaybillManager(int limit) {
    this.limit = limit;
  }

  protected PlaybillManager(PlaybillRepository repo) {
    this.repo = repo;
  }

  protected PlaybillPoster[] findLast() {
    PlaybillPoster[] all = repo.getItems();
    new PlaybillManager();
    int resultLength = limit;
    PlaybillPoster[] reversed = new PlaybillPoster[resultLength];
    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = all[all.length - 1 - i];
    }
    return reversed;
  }

  protected PlaybillPoster[] findLast(int limit) {
    PlaybillPoster[] all = repo.getItems();
    new PlaybillManager(limit);
    int resultLength = Math.min(limit, 10);
    PlaybillPoster[] reversed = new PlaybillPoster[resultLength];
    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = all[all.length - 1 - i];
    }
    return reversed;
  }
}
