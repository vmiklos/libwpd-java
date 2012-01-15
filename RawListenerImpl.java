/* libwpd
 * Copyright (C) 2008 Miklos Vajna (vmiklos-at-frugalware-dot-org)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 *
 * For further information visit http://libwpd.sourceforge.net
 */

/* "This product is not manufactured, approved, or supported by
 * Corel Corporation or Corel Corporation Limited."
 */

import org.sourceforge.libwpd.*;
import java.util.*;

class RawListenerImpl implements WPXHLListenerJavaInterface
{
	private String getPropString(LinkedHashMap<String,String> propList)
	{
		String propString = "";
		Set set = propList.keySet();
		Iterator i = set.iterator();
		if(i.hasNext())
		{
			String key = (String)i.next();
			propString += key + ": " + propList.get(key);
			for (; i.hasNext(); )
			{
				key = (String)i.next();
				propString += ", " + key + ": " + propList.get(key);
			}
		}
		return propString;
	}

	private String getPropString(Vector<LinkedHashMap<String,String>> itemList)
	{
		String propString = "(";
		Iterator<LinkedHashMap<String,String>> i = itemList.iterator();
		if (i.hasNext())
		{
			propString += "(" + getPropString(i.next()) + ")";
			for (; i.hasNext();)
				propString += ", (" +getPropString(i.next()) + ")";
		}
		propString += ")";
		return propString;
	}

	public void setDocumentMetaData(LinkedHashMap<String,String> propList)
	{
		System.out.println("setDocumentMetaData(" + getPropString(propList) + ")");
	}

	public void startDocument()
	{
		System.out.println("startDocument()");
	}

	public void endDocument()
	{
		System.out.println("endDocument()");
	}

	public void openPageSpan(LinkedHashMap<String,String> propList)
	{
		System.out.println("openPageSpan(" + getPropString(propList) + ")");
	}

	public void closePageSpan()
	{
		System.out.println("closePageSpan()");
	}

	public void openHeader(LinkedHashMap<String,String> propList)
	{
		System.out.println("openHeader(" + getPropString(propList) + ")");
	}

	public void closeHeader()
	{
		System.out.println("closeHeader()");
	}

	public void openFooter(LinkedHashMap<String,String> propList)
	{
		System.out.println("openFooter(" + getPropString(propList) + ")");
	}

	public void closeFooter()
	{
		System.out.println("closeFooter()");
	}

	public void openParagraph(LinkedHashMap<String,String> propList, Vector<LinkedHashMap<String,String>> tabStops)
	{
		System.out.println("openParagraph(" + getPropString(propList)+", tab-stops: " +
				getPropString(tabStops)+")");
	}

	public void closeParagraph()
	{
		System.out.println("closeParagraph()");
	}

	public void openSpan(LinkedHashMap<String,String> propList)
	{
		System.out.println("openSpan("+getPropString(propList)+")");
	}

	public void closeSpan()
	{
		System.out.println("closeSpan()");
	}

	public void openSection(LinkedHashMap<String,String> propList, Vector<LinkedHashMap<String,String>> columns)
	{
		System.out.println("openSection("+getPropString(propList)+", columns: "+getPropString(columns)+")");
	}

	public void closeSection()
	{
		System.out.println("closeSection()");
	}


	public void insertTab()
	{
		System.out.println("insertTab()");
	}

	public void insertText(String text)
	{
		System.out.println("insertText(text: "+text+")");
	}

	public void insertLineBreak()
	{
		System.out.println("insertLineBreak()");
	}


	public void defineOrderedListLevel(LinkedHashMap<String,String> propList)
	{
		System.out.println("defineOrderedListLevel("+getPropString(propList)+")");
	}

	public void defineUnorderedListLevel(LinkedHashMap<String,String> propList)
	{
		System.out.println("defineUnorderedListLevel("+getPropString(propList)+")");
	}

	public void openOrderedListLevel(LinkedHashMap<String,String> propList)
	{
		System.out.println("openOrderedListLevel("+getPropString(propList)+")");
	}

	public void openUnorderedListLevel(LinkedHashMap<String,String> propList)
	{
		System.out.println("openUnorderedListLevel("+getPropString(propList)+")");
	}

	public void closeOrderedListLevel()
	{
		System.out.println("closeOrderedListLevel()");
	}

	public void closeUnorderedListLevel()
	{
		System.out.println("closeUnorderedListLevel()");
	}

	public void openListElement(LinkedHashMap<String,String> propList, Vector<LinkedHashMap<String,String>> tabStops)
	{
		System.out.println("openListElement("+getPropString(propList)+", tab-stops: "+getPropString(tabStops)+")");
	}

	public void closeListElement()
	{
		System.out.println("closeListElement()");
	}


	public void openFootnote(LinkedHashMap<String,String> propList)
	{
		System.out.println("openFootnote("+getPropString(propList)+")");
	}

	public void closeFootnote()
	{
		System.out.println("closeFootnote()");
	}

	public void openEndnote(LinkedHashMap<String,String> propList)
	{
		System.out.println("openEndnote("+getPropString(propList)+")");
	}

	public void closeEndnote()
	{
		System.out.println("closeEndnote()");
	}


	public void openTable(LinkedHashMap<String,String> propList, Vector<LinkedHashMap<String,String>> columns)
	{
		System.out.println("openTable("+getPropString(propList)+", columns: "+getPropString(columns)+")");
	}

	public void openTableRow(LinkedHashMap<String,String> propList)
	{
		System.out.println("openTableRow("+getPropString(propList)+")");
	}

	public void closeTableRow()
	{
		System.out.println("closeTableRow()");
	}

	public void openTableCell(LinkedHashMap<String,String> propList)
	{
		System.out.println("openTableCell("+getPropString(propList)+")");
	}

	public void closeTableCell()
	{
		System.out.println("closeTableCell()");
	}

	public void insertCoveredTableCell(LinkedHashMap<String,String> propList)
	{
		System.out.println("insertCoveredTableCell("+getPropString(propList)+")");
	}

	public void closeTable()
	{
		System.out.println("closeTable()");
	}
}
