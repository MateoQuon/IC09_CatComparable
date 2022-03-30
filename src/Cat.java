public class Cat implements Comparable<Cat> {
	// Comparable interface - determines the sort order of classes
  private String mName;
  private String mBreed;
  private int mAge;

  public Cat(String name, String breed, int age) {
    mName = name;
    mBreed = breed;
    mAge = age;
  }

  @Override
  public String toString() {
    return "Cat [Name=" + mName + ", Breed=" + mBreed + ", Age=" + mAge + ", Human Age=" + ageInHumanYears() + "]";
  }

  public int ageInHumanYears() {
    if (mAge == 1)
      return 15;
    else if (mAge == 2)
      return 24;
    else
      return 24 + (mAge - 2) * 4;
  }

  @Override
  public int compareTo(Cat other) {
    // Compare cats first by Age (int)
    int ageComp = this.mAge - other.mAge;
    if (ageComp != 0)
      return ageComp;

    // Then compare by Name (String)
    int nameComp = this.mName.compareToIgnoreCase(other.mName);
    if (nameComp != 0)
      return nameComp;

    // Finally by breed (String)
      return this.mBreed.compareToIgnoreCase(other.mBreed);
  }
}
// Interface = purely abstract, no public constructor, no toString,