// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

class DocumentsContractApi21
{

    private static final String TAG = "DocumentFile";

    DocumentsContractApi21()
    {
    }

    private static void closeQuietly(AutoCloseable autocloseable)
    {
        if (autocloseable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        autocloseable.close();
        return;
        autocloseable;
        throw autocloseable;
        autocloseable;
    }

    public static Uri createDirectory(Context context, Uri uri, String s)
    {
        return createFile(context, uri, "vnd.android.document/directory", s);
    }

    public static Uri createFile(Context context, Uri uri, String s, String s1)
    {
        return DocumentsContract.createDocument(context.getContentResolver(), uri, s, s1);
    }

    public static Uri[] listFiles(Context context, Uri uri)
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        Uri uri1;
        obj1 = context.getContentResolver();
        uri1 = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        arraylist = new ArrayList();
        obj = null;
        context = null;
        obj1 = ((ContentResolver) (obj1)).query(uri1, new String[] {
            "document_id"
        }, null, null, null);
_L2:
        context = ((Context) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj1));
        obj = obj1;
        arraylist.add(DocumentsContract.buildDocumentUriUsingTree(uri, ((Cursor) (obj1)).getString(0)));
        if (true) goto _L2; else goto _L1
        uri;
        obj = context;
        Log.w("DocumentFile", (new StringBuilder()).append("Failed query: ").append(uri).toString());
        closeQuietly(context);
_L4:
        return (Uri[])arraylist.toArray(new Uri[arraylist.size()]);
_L1:
        closeQuietly(((AutoCloseable) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        context;
        closeQuietly(((AutoCloseable) (obj)));
        throw context;
    }

    public static Uri prepareTreeUri(Uri uri)
    {
        return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
    }

    public static Uri renameTo(Context context, Uri uri, String s)
    {
        return DocumentsContract.renameDocument(context.getContentResolver(), uri, s);
    }
}
