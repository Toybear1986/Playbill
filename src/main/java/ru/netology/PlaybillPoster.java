package ru.netology;

public class PlaybillPoster {
  private int id;

  protected PlaybillPoster(String imageUrl, String filmName, String genre, boolean premiereTomorrow, int id) {
    this.id = id;
  }

  protected int getId() {
    return id;
  }
}
