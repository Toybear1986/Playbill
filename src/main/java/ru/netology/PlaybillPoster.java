package ru.netology;

public class PlaybillPoster {
  protected int id;
  protected String imageUrl;
  protected String filmName;
  protected String genre;
  protected boolean premiereTomorrow;

  public PlaybillPoster(String imageUrl, String filmName, String genre, boolean premiereTomorrow, int id) {
    this.id = id;
  }
}
