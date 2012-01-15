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

public class main
{
	public static void main(String argv[])
	{
		String file = "";

		if(argv.length < 2)
		{
			System.out.println("Usage: wpd2raw [OPTION] <WordPerfect Document>");
			System.exit(-1);
		}
		else if(argv[1].equals("--help"))
		{
			System.out.println("Usage: wpd2raw [OPTION] <WordPerfect Document>");
			System.out.println("");
			System.out.println("Options:");
			System.out.println("--help              Shows this help message");
			System.exit(0);
		}
		else
			file = argv[1];

		if (!WPDocumentJava.isFileWordPerfectDocument(file))
		{
			System.out.println("ERROR: Unsupported file format!");
			System.exit(1);
		}

		if (!WPDocumentJava.parseFile(file, new RawListenerImpl()))
		{
			System.out.println("ERROR: Failed to parse the document!");
			System.exit(1);
		}
	}
}
