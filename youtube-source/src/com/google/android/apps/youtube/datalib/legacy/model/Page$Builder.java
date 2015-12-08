// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, Page

public class entries
    implements r, Serializable
{

    protected int elementsPerPage;
    protected List entries;
    protected Uri nextUri;
    protected Uri previousUri;
    protected int startIndex;
    protected int totalResults;

    private void readObject(ObjectInputStream objectinputstream)
    {
        totalResults = objectinputstream.readInt();
        elementsPerPage = objectinputstream.readInt();
        startIndex = objectinputstream.readInt();
        previousUri = p.a((String)objectinputstream.readObject());
        nextUri = p.a((String)objectinputstream.readObject());
        entries = (List)objectinputstream.readObject();
    }

    private Object readResolve()
    {
        return build();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(totalResults);
        objectoutputstream.writeInt(elementsPerPage);
        objectoutputstream.writeInt(startIndex);
        objectoutputstream.writeObject(p.a(previousUri));
        objectoutputstream.writeObject(p.a(nextUri));
        objectoutputstream.writeObject(entries);
    }

    public entries addEntries(List list)
    {
        c.a(list);
        entries.addAll(list);
        return this;
    }

    public entries addEntry(Object obj)
    {
        entries.add(obj);
        return this;
    }

    public Page build()
    {
        return new Page(totalResults, elementsPerPage, startIndex, previousUri, nextUri, entries);
    }

    public volatile Object build()
    {
        return build();
    }

    public build elementsPerPage(int i)
    {
        elementsPerPage = i;
        return this;
    }

    public elementsPerPage entries(List list)
    {
        c.a(list);
        entries.clear();
        entries.addAll(list);
        return this;
    }

    public entries nextUri(Uri uri)
    {
        nextUri = uri;
        return this;
    }

    public nextUri previousUri(Uri uri)
    {
        previousUri = uri;
        return this;
    }

    public previousUri startIndex(int i)
    {
        startIndex = i;
        return this;
    }

    public startIndex totalResults(int i)
    {
        totalResults = i;
        return this;
    }

    public ()
    {
        entries = new LinkedList();
    }
}
