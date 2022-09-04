package ru.netology;

public class PlaybillManager {
  protected PlaybillPoster[] posters = new PlaybillPoster[0];

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

  public int lastNumber = 10;

  public PlaybillPoster[] findLast() {
    PlaybillPoster[] all = getPosters();
    int resultLength;
    resultLength = lastNumber;
    PlaybillPoster[] result = new PlaybillPoster[resultLength];
    for (int i = 0; i < result.length; i++) {
      result[i] = all[all.length - 1 - i];
    }
    return result;
  }

  public PlaybillPoster[] findLast(int lastNumber) {
    PlaybillPoster[] all = getPosters();
    int resultLength = Math.min(lastNumber, 10);
    PlaybillPoster[] result = new PlaybillPoster[resultLength];
    for (int i = 0; i < result.length; i++) {
      result[i] = all[all.length - 1 - i];
    }
    return result;
  }
}
