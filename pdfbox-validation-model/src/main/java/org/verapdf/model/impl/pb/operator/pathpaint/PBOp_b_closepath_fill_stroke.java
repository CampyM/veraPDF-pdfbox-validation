/**
 * This file is part of veraPDF PDF Box PDF/A Validation Model Implementation, a module of the veraPDF project.
 * Copyright (c) 2015, veraPDF Consortium <info@verapdf.org>
 * All rights reserved.
 *
 * veraPDF PDF Box PDF/A Validation Model Implementation is free software: you can redistribute it and/or modify
 * it under the terms of either:
 *
 * The GNU General public license GPLv3+.
 * You should have received a copy of the GNU General Public License
 * along with veraPDF PDF Box PDF/A Validation Model Implementation as the LICENSE.GPL file in the root of the source
 * tree.  If not, see http://www.gnu.org/licenses/ or
 * https://www.gnu.org/licenses/gpl-3.0.en.html.
 *
 * The Mozilla Public License MPLv2+.
 * You should have received a copy of the Mozilla Public License along with
 * veraPDF PDF Box PDF/A Validation Model Implementation as the LICENSE.MPL file in the root of the source tree.
 * If a copy of the MPL was not distributed with this file, you can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */
package org.verapdf.model.impl.pb.operator.pathpaint;

import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.verapdf.model.factory.operator.GraphicState;
import org.verapdf.model.operator.Op_b_closepath_fill_stroke;
import org.verapdf.model.tools.resources.PDInheritableResources;
import org.verapdf.pdfa.flavours.PDFAFlavour;

import java.util.List;

/**
 * Operator which closes, fills and then strokes the pat. Uses the
 * nonzero winding number rule to determine the region to fill
 *
 * @author Timur Kamalov
 */
public class PBOp_b_closepath_fill_stroke extends PBOpFillAndStroke implements
		Op_b_closepath_fill_stroke {

	/** Type name for {@code PBOp_b_closepath_fill_stroke} */
	public static final String OP_B_CLOSEPATH_FILL_STROKE_TYPE = "Op_b_closepath_fill_stroke";

	/**
	 * Default constructor.
	 *
	 * @param arguments arguments for current operator, must be empty
	 * @param state graphic state for current operator
	 * @param resources resources for tilling pattern if it`s used
	 */
	public PBOp_b_closepath_fill_stroke(List<COSBase> arguments,
										final GraphicState state,
										final PDInheritableResources resources, PDDocument document, PDFAFlavour flavour) {
		super(arguments, state, resources, OP_B_CLOSEPATH_FILL_STROKE_TYPE, document, flavour);
	}

}
