/* Copyright (c) 2016 Tresys Technology, LLC. All rights reserved.
 *
 * Developed by: Tresys Technology, LLC
 *               http://www.tresys.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal with
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 *  1. Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimers.
 *
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimers in the
 *     documentation and/or other materials provided with the distribution.
 *
 *  3. Neither the names of Tresys Technology, nor the names of its contributors
 *     may be used to endorse or promote products derived from this Software
 *     without specific prior written permission.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * CONTRIBUTORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS WITH THE
 * SOFTWARE.
 */

package edu.illinois.ncsa.daffodil.processors

import edu.illinois.ncsa.daffodil.dsom._

class TextStandardDecimalSeparatorEv(expr: CompiledExpression[String], trd: TermRuntimeData)
  extends EvaluatableConvertedExpression[String, List[String]](
    expr,
    TextStandardDecimalSeparatorCooker,
    trd)
  with InfosetCachedEvaluatable[List[String]] {
  override lazy val runtimeDependencies = Nil
}

class TextStandardGroupingSeparatorEv(expr: CompiledExpression[String], trd: TermRuntimeData)
  extends EvaluatableConvertedExpression[String, String](
    expr,
    TextStandardGroupingSeparatorCooker,
    trd)
  with InfosetCachedEvaluatable[String] {
  override lazy val runtimeDependencies = Nil
}

class TextStandardExponentRepEv(expr: CompiledExpression[String], trd: TermRuntimeData)
  extends EvaluatableConvertedExpression[String, String](
    expr,
    TextStandardExponentRepCooker,
    trd)
  with InfosetCachedEvaluatable[String] {
  override lazy val runtimeDependencies = Nil
}

class TextBooleanTrueRepEv(expr: CompiledExpression[String], trd: TermRuntimeData)
  extends EvaluatableConvertedExpression[String, List[String]](
    expr,
    TextBooleanTrueRepCooker,
    trd)
  with InfosetCachedEvaluatable[List[String]] {
  override lazy val runtimeDependencies = Nil
}

class TextBooleanFalseRepEv(expr: CompiledExpression[String], trd: TermRuntimeData)
  extends EvaluatableConvertedExpression[String, List[String]](
    expr,
    TextBooleanFalseRepCooker,
    trd)
  with InfosetCachedEvaluatable[List[String]] {
  override lazy val runtimeDependencies = Nil
}