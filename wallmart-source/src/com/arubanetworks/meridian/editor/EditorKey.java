// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.editor;

import com.arubanetworks.meridian.internal.util.Obj;
import com.arubanetworks.meridian.internal.util.Strings;
import java.io.Serializable;

public class EditorKey
    implements Serializable
{

    private final String a;
    private final EditorKey b;

    public EditorKey(String s)
    {
        this(s, null);
    }

    public EditorKey(String s, EditorKey editorkey)
    {
        if (Strings.isNullOrEmpty(s))
        {
            throw new IllegalArgumentException("ID must not be null or empty.");
        } else
        {
            a = s;
            b = editorkey;
            return;
        }
    }

    public static EditorKey forApp(String s)
    {
        return new EditorKey(s);
    }

    public static EditorKey forMap(String s, EditorKey editorkey)
    {
        return new EditorKey(s, editorkey);
    }

    public static EditorKey forMap(String s, String s1)
    {
        return new EditorKey(s, forApp(s1));
    }

    public static EditorKey forPlacemark(String s, EditorKey editorkey)
    {
        if (editorkey == null)
        {
            throw new IllegalArgumentException("MapKey must not be null.");
        }
        if (editorkey.getParent() == null)
        {
            throw new IllegalArgumentException("MapKey must not have null parent.");
        } else
        {
            return new EditorKey(s, editorkey);
        }
    }

    public static EditorKey forPlacemark(String s, String s1, String s2)
    {
        return new EditorKey(s, forMap(s1, s2));
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof EditorKey)
        {
            obj = (EditorKey)obj;
        } else
        {
            obj = null;
        }
        return obj != null && Obj.equals(a, ((EditorKey) (obj)).a) && Obj.equals(b, ((EditorKey) (obj)).b);
    }

    public String getId()
    {
        return a;
    }

    public EditorKey getParent()
    {
        return b;
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    public String toString()
    {
        String s = a;
        for (EditorKey editorkey = b; editorkey != null; editorkey = editorkey.b)
        {
            s = (new StringBuilder()).append(editorkey.a).append("/").append(s).toString();
        }

        return String.format("<EditorKey %s>", new Object[] {
            s
        });
    }
}
