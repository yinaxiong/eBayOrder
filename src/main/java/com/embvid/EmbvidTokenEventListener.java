/*The MIT License (MIT)

Copyright (c) 2014 Anand Singh

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.*/

package com.embvid;

import com.ebay.sdk.TokenEventListener;
import com.ebay.sdk.util.eBayUtil;

/**
 * <p>
 * Title: EmbvidTokenEventListener.Java
 * </p>
 * <p>
 * Description: A Java Application to process orders of ebay.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Anand Singh
 * @version 1.0
 */
public class EmbvidTokenEventListener implements TokenEventListener {

	EmbvidFrame mainFrame;

	public EmbvidTokenEventListener(EmbvidFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public void renewToken(String newToken) {
		mainFrame.showInfoMessage("eBay Token has been renewed successfully!");
	}

	public void warnHardExpiration(java.util.Date expirationDate) {
		mainFrame.showInfoMessage("Received token hard-expiration-warning: "
				+ eBayUtil.toAPITimeString(expirationDate));
	}
}
