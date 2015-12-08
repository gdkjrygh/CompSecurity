// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import org.codehaus.jackson.Version;

public class VersionUtil
{

    public static final String VERSION_FILE = "VERSION.txt";
    private static final Pattern VERSION_SEPARATOR = Pattern.compile("[-_./;:]");

    public VersionUtil()
    {
    }

    public static Version parseVersion(String s)
    {
        int i = 0;
        Object obj = null;
        String as[];
        if (s != null)
        {
            if ((s = s.trim()).length() != 0 && (as = VERSION_SEPARATOR.split(s)).length >= 2)
            {
                int j = parseVersionPart(as[0]);
                int k = parseVersionPart(as[1]);
                if (as.length > 2)
                {
                    i = parseVersionPart(as[2]);
                }
                s = obj;
                if (as.length > 3)
                {
                    s = as[3];
                }
                return new Version(j, k, i, s);
            }
        }
        return null;
    }

    protected static int parseVersionPart(String s)
    {
        s = s.toString();
        int k = s.length();
        int j = 0;
        int i = 0;
        do
        {
            char c;
label0:
            {
                if (i < k)
                {
                    c = s.charAt(i);
                    if (c <= '9' && c >= '0')
                    {
                        break label0;
                    }
                }
                return j;
            }
            j = j * 10 + (c - 48);
            i++;
        } while (true);
    }

    public static Version versionFor(Class class1)
    {
        Object obj;
        IOException ioexception;
        Object obj1;
        ioexception = null;
        obj1 = null;
        obj = ioexception;
        InputStream inputstream = class1.getResourceAsStream("VERSION.txt");
        class1 = obj1;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        class1 = parseVersion((new BufferedReader(new InputStreamReader(inputstream, "UTF-8"))).readLine());
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            obj = class1;
            try
            {
                throw new RuntimeException(ioexception);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                class1 = ((Class) (obj));
            }
        }
        obj = class1;
        if (class1 == null)
        {
            obj = Version.unknownVersion();
        }
        return ((Version) (obj));
        class1;
        inputstream.close();
        obj = ioexception;
        throw class1;
        class1;
        obj = ioexception;
        throw new RuntimeException(class1);
    }

}
