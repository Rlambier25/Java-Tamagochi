public class Tomogotchi {

  int MAX_HUNGER = 10;
  int MAX_SLEEP = 10;
  int MAX_ACTIVITY = 10;

  int mCurrentHunger;
  int mCurrentSleep;
  int mCurrentActivity;
  int mTotalHealth;

  public Tomogotchi () {
    mCurrentHunger = 7;
    mCurrentSleep = MAX_SLEEP;
    mCurrentActivity = MAX_ACTIVITY;
  }
  public int totalHealth () {
    return mTotalHealth = mCurrentHunger + mCurrentSleep + mCurrentActivity;
  }
  public int getHunger () {
    return mCurrentHunger;
  }
  public int getSleep () {
    return mCurrentSleep;
  }
  public int getActivity () {
    return mCurrentActivity;
  }
  public void feed () {
    mCurrentHunger++;
    mCurrentSleep = mCurrentSleep - 2;
    mCurrentActivity = mCurrentActivity - 2;
  }
  public void rest () {
    mCurrentSleep++;
    mCurrentHunger = mCurrentHunger - 2;
    mCurrentActivity = mCurrentActivity - 2;
  }
  public void exercise () {
    mCurrentActivity++;
    mCurrentHunger = mCurrentHunger - 2;
    mCurrentSleep = mCurrentSleep - 2;
  }

  public boolean isAlive() {
    return mTotalHealth > 2;
  }

}
