package ru.netology;

public class PlaybillRepository {
  private PlaybillPoster[] items = new PlaybillPoster[0];

  public PlaybillPoster[] findAll() {
    return items;
  }

  public void save(PlaybillPoster poster) {
    PlaybillPoster[] tmp = new PlaybillPoster[items.length + 1];
    System.arraycopy(items, 0, tmp, 0, items.length);
    tmp[tmp.length - 1] = poster;
    items = tmp;
  }

  public PlaybillPoster findById(int id) {
    for (PlaybillPoster item : items) {
      if (id == item.getId()) {
        return item;
      }
    }
    return null;
  }

  public void removeById(int id) {
    PlaybillPoster[] tmp = new PlaybillPoster[items.length - 1];
    int copyToIndex = 0;
    for (PlaybillPoster item : items) {
      if (item.getId() != id) {
        tmp[copyToIndex] = item;
        copyToIndex++;
      }
    }
    items = tmp;
  }

  public void removeAll() {
    PlaybillPoster[] empty = {};
    items = empty;    
  }

  public PlaybillPoster[] getItems() {
    return items;
  }
}