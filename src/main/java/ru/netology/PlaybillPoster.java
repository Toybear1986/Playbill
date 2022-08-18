package ru.netology;

public class PlaybillPoster {
  private int id;

  public PlaybillPoster(String imageUrl, String filmName, String genre, boolean premiereTomorrow, int id) {

    this.id = id;
  }

  public int getId() {
    return id;
  }
}
