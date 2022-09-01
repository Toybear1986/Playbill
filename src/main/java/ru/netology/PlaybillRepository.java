package ru.netology;

public class PlaybillRepository {
  private PlaybillPoster[] items = new PlaybillPoster[0];

  public PlaybillRepository() {
  }

  protected PlaybillPoster[] findAll() {
    return items;
  }

  protected PlaybillPoster findById(int id) {
    for (PlaybillPoster item : items) {
      if (id == item.getId()) {
        return item;
      }
    }
    return null;
  }

  protected void removeById(int id) {
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

  protected void save(PlaybillPoster poster) {
    PlaybillPoster[] tmp = new PlaybillPoster[items.length + 1];
    System.arraycopy(items, 0, tmp, 0, items.length);
    tmp[tmp.length - 1] = poster;
    items = tmp;
  }

  protected void removeAll() {
    items = new PlaybillPoster[]{};
  }

  protected PlaybillPoster[] getItems() {
    return items;
  }
}