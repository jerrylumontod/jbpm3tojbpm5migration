// ReaderInput.java
// This file contains generated code and will be overwritten when you rerun code generation.package com.migration.io;

package com.migration.io;

import java.io.Reader;

public class ReaderInput extends Input
{
	private Reader reader;
	
	public ReaderInput(Reader reader)
	{
		super(Input.IO_READER);
		this.reader = reader;
	}
	
	public Reader getReader() {return reader;}
}

