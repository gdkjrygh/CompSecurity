// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Page
    implements Serializable, Iterable
{

    public final int elementsPerPage;
    public final List entries;
    public final Uri nextUri;
    public final Uri previousUri;
    public final int startIndex;
    public final int totalResults;

    public Page(int i, int j, int k, Uri uri, Uri uri1, List list)
    {
        totalResults = i;
        elementsPerPage = j;
        startIndex = k;
        previousUri = uri;
        nextUri = uri1;
        entries = (List)c.a(list);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("builder required");
    }

    private Object writeReplace()
    {
        return buildUpon();
    }

    public Builder buildUpon()
    {
        return (new Builder()).totalResults(totalResults).elementsPerPage(elementsPerPage).startIndex(startIndex).previousUri(previousUri).nextUri(nextUri).addEntries(entries);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof Page)) goto _L4; else goto _L3
_L3:
        obj = (Page)obj;
        flag = flag1;
        if (totalResults != ((Page) (obj)).totalResults) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (elementsPerPage != ((Page) (obj)).elementsPerPage) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (startIndex != ((Page) (obj)).startIndex) goto _L4; else goto _L7
_L7:
        if (previousUri != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((Page) (obj)).previousUri != null) goto _L4; else goto _L10
_L10:
        if (nextUri != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = flag1;
        if (((Page) (obj)).nextUri != null) goto _L4; else goto _L11
_L11:
        return entries.equals(((Page) (obj)).entries);
_L9:
        if (!previousUri.equals(((Page) (obj)).previousUri))
        {
            return false;
        }
          goto _L10
        if (!nextUri.equals(((Page) (obj)).nextUri))
        {
            return false;
        }
          goto _L11
    }

    public Iterator iterator()
    {
        return entries.iterator();
    }

    public String toString()
    {
        return (new StringBuilder("{totalResults: ")).append(totalResults).append(", elementsPerPage: ").append(elementsPerPage).append(", startIndex: ").append(startIndex).append(", previousUri: ").append(previousUri).append(", nextUri: ").append(nextUri).append(", entries: ").append(entries).append("}").toString();
    }

    private class Builder
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

        public Builder addEntries(List list)
        {
            c.a(list);
            entries.addAll(list);
            return this;
        }

        public Builder addEntry(Object obj)
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

        public Builder elementsPerPage(int i)
        {
            elementsPerPage = i;
            return this;
        }

        public Builder entries(List list)
        {
            c.a(list);
            entries.clear();
            entries.addAll(list);
            return this;
        }

        public Builder nextUri(Uri uri)
        {
            nextUri = uri;
            return this;
        }

        public Builder previousUri(Uri uri)
        {
            previousUri = uri;
            return this;
        }

        public Builder startIndex(int i)
        {
            startIndex = i;
            return this;
        }

        public Builder totalResults(int i)
        {
            totalResults = i;
            return this;
        }

        public Builder()
        {
            entries = new LinkedList();
        }
    }

}
