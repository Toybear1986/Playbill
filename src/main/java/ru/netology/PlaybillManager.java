package ru.netology;

public class PlaybillManager {

  protected int limit;
  private PlaybillRepository repo;

  protected PlaybillManager(PlaybillRepository repo) {
    this.limit = 10;
    this.repo = repo;
  }

  public PlaybillManager(int limit, PlaybillRepository repo) {
    this.limit = limit;
    this.repo = repo;
  }

  protected PlaybillPoster[] findLast() {
    PlaybillPoster[] all = repo.getItems();
    int resultLength = Math.min(limit, all.length);
    PlaybillPoster[] reversed = new PlaybillPoster[resultLength];
    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = all[all.length - 1 - i];
    }
    return reversed;
  }
}