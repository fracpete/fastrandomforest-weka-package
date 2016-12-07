/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Copyright (C) 2016 University of Waikato, Hamilton, New Zealand
 */

package hr.irb.fastRandomForest;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import weka.classifiers.AbstractClassifierTest;
import weka.classifiers.Classifier;

/**
 * Tests FastRandomForest. Run from the command line with:<br><br>
 * java weka.classifiers.trees.FastRandomForestTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10824 $
 */
public class FastRandomForestTest
  extends AbstractClassifierTest {

  /**
   * Initializes the test.
   *
   * @param name	the name of the test
   */
  public FastRandomForestTest(String name) {
    super(name);
    System.setProperty("weka.test.Regression.root", "src/test/resources");
  }

  /**
   * Creates a FastRandomForest.
   *
   * @return		the configured classifier
   */
  @Override
  public Classifier getClassifier() {
    return new FastRandomForest();
  }

  /**
   * Disabled for the time being.
   */
  @Override
  public void testClassAsNthAttribute() {
  }

  /**
   * Disabled for the time being.
   */
  @Override
  public void testAttributes() {
  }

  /**
   * Returns the test suite.
   *
   * @return		the suite
   */
  public static Test suite() {
    return new TestSuite(FastRandomForestTest.class);
  }

  /**
   * Runs the test from commandline.
   *
   * @param args	ignored
   */
  public static void main(String[] args) {
    TestRunner.run(suite());
  }
}
