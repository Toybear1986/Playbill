package ru.netology;

public class PlaybillManager {
  private PlaybillRepository repo;

  public PlaybillManager(PlaybillRepository repo) {
    this.repo = repo;
  }

  public int lastNumber = 10;

  public PlaybillPoster[] findLast() {
    PlaybillPoster[] all = repo.getItems();
    int resultLength;
    resultLength = lastNumber;
    PlaybillPoster[] reversed = new PlaybillPoster[resultLength];
    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = all[all.length - 1 - i];
    }
    return reversed;
  }

  public PlaybillPoster[] findLast(int lastNumber) {
    PlaybillPoster[] all = repo.getItems();
    int resultLength = Math.min(lastNumber, 10);
    PlaybillPoster[] reversed = new PlaybillPoster[resultLength];
    for (int i = 0; i < reversed.length; i++) {
      reversed[i] = all[all.length - 1 - i];
    }
    return reversed;
  }
}
