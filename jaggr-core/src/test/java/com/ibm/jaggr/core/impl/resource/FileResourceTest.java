/*
 * (C) Copyright 2012, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.jaggr.core.impl.resource;

import org.junit.Test;

import java.io.File;
import java.net.URI;

import junit.framework.Assert;

public class FileResourceTest {

	@Test
	public void testAuthority() throws Exception {
		if (File.separatorChar == '\\') {	// Authority component only supported on Windows
			FileResource res = new FileResource(new URI("file://server/path/name.ext"));
			Assert.assertEquals("\\\\server\\path\\name.ext", res.file.getAbsolutePath());
			Assert.assertEquals("file://server/path/name.ext", res.getURI().toString());
		}
	}

}
