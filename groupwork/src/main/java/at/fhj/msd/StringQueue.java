package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
    maxSize = maxSize;
  }

  /**
   * Adds a string to the menu
   * @param obj   data type Object to add various types of data to list
   * @return true if successful and false is unsuccessful
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * deletes the first element from the list
   * @return first drink if its in the list or else null if none are in the list
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  /**
   * removes the first element from the list
   * @return first element or
   * @throws NoSuchElementException if nothing in the list
   */
  @Override
  public String remove() {
    String element = poll();

    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * gets the very first string in the list
   * @return null or the first element
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * gets the very first string in the list
   * @return the first string if one is in the list else
   * @throws NoSuchElementException
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}
