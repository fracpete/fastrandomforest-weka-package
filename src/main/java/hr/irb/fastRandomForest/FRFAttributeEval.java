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
 *    FRFAttributeEval.java
 *    Copyright (C) 2008 Fran Supek
 */

package hr.irb.fastRandomForest;

import weka.attributeSelection.ASEvaluation;
import weka.attributeSelection.AttributeEvaluator;
import weka.classifiers.AbstractClassifier;
import weka.core.Capabilities;
import weka.core.Instances;
import weka.core.RevisionUtils;

/**
 * Evaluate the merit of each attribute using a random forest.
 *
 * @author Santi Villalba
 * @version $Id: FRFAttributeEval.java 49 2010-10-05 14:05:11Z vinaysethmohta $
 */
public class FRFAttributeEval extends ASEvaluation implements AttributeEvaluator {

  private static final long serialVersionUID = -4504270948574160991L;

  /** The feature importances. */
  private double[] m_Importances;

  /** The prototype for the rf. */
  private FastRandomForest m_frfProto = new FastRandomForest();

  /** Constructor */
  public FRFAttributeEval() {
  }

  /**
   * Constructor.
   *
   * @param frfProto the prototype for the random forest.
   */
  public FRFAttributeEval(FastRandomForest frfProto) {
    m_frfProto = frfProto;
  }

  /** {@inheritDoc} */
  public void buildEvaluator(Instances data) throws Exception {
    FastRandomForest forest = (FastRandomForest) AbstractClassifier.makeCopy(m_frfProto);
    forest.buildClassifier(data);
    m_Importances = forest.getFeatureImportances();
  }

  /** {@inheritDoc} */
  public double evaluateAttribute(int attribute) throws Exception {
    return m_Importances[attribute];
  }

  /** @return the prototype for the random forest */
  public FastRandomForest getFrfProto() {
    return m_frfProto;
  }

  /** @param frfProto the prototype for the random forest */
  public void setFrfProto(FastRandomForest frfProto) {
    m_frfProto = frfProto;
  }

  @Override
  public Capabilities getCapabilities() {
    return m_frfProto.getCapabilities();
  }

  @Override
  public String getRevision() {
    return RevisionUtils.extract("$Id: FRFAttributeEval.java 49 2010-10-05 14:05:11Z vinaysethmohta $");
  }

  //TODO: uncomment after implementing all the optionhandler machinery
  //  public static void main(String[] args) {
  //    runEvaluator(new FRFAttributeEval(), args);
  //  }
}
