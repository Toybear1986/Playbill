package ru.netology;

public class PlaybillManager {
  protected PlaybillPoster[] posters = new PlaybillPoster[0];
  public int lastNumber;

  public PlaybillManager() {
    this.lastNumber = 10;
  }

  public PlaybillManager(int lastNumber) {
    this.lastNumber = lastNumber;
  }

  public void save(PlaybillPoster poster) {
    PlaybillPoster[] tmp = new PlaybillPoster[posters.length + 1];
    System.arraycopy(posters, 0, tmp, 0, posters.length);
    tmp[tmp.length - 1] = poster;
    posters = tmp;
  }

  public PlaybillPoster[] findAll() {
    return posters;
  }

  public PlaybillPoster[] getPosters() {
    return posters;
  }

  public PlaybillPoster[] findLast() {
    PlaybillPoster[] all = getPosters();
    int resultLength = Math.min(lastNumber, all.length);
    PlaybillPoster[] result = new PlaybillPoster[resultLength];
    for (int i = 0; i < result.length; i++) {
      result[i] = all[all.length - 1 - i];
    }
    return result;
  }
}
