/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.hadoop.util;

/**
 * Defines table column headers used by {@link Table}.
 *
 * {@link UiUtils}
 *
 * @author Gunnar Hillert
 * @since 1.0.0
 *
 */
public class TableHeader {

	private int width = 0;
	private String name;

	/**
	 * Constructor that initializes the table header with the provided header name
	 * and the with of the table header.
	 *
	 * @param name
	 * @param width
	 */
	public TableHeader(String name, int width) {

		super();
		this.width = width;
		this.name = name;

	}

	/**
	 * Constructor that initializes the table header with the provided header name.
	 * The with of the table header is calculated and assigned based on the provided
	 * header name.
	 *
	 * @param name
	 */
	public TableHeader(String name) {
		super();
		this.name = name;

		if (name == null) {
			this.width = 0;
		} else {
			this.width = name.length();
		}

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Updated the width for this particular column, but only if the value of the
	 * passed-in width is higher than the value of the pre-existing width.
	 *
	 * @param width
	 */
	public void updateWidth(int width) {
		if (this.width < width) {
			this.width = width;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
