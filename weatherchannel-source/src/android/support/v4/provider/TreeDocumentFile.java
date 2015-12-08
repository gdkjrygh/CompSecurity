// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.provider;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package android.support.v4.provider:
//            DocumentFile, DocumentsContractApi19, DocumentsContractApi21

class TreeDocumentFile extends DocumentFile
{

    private Context mContext;
    private Uri mUri;

    TreeDocumentFile(DocumentFile documentfile, Context context, Uri uri)
    {
        super(documentfile);
        mContext = context;
        mUri = uri;
    }

    public boolean canRead()
    {
        return DocumentsContractApi19.canRead(mContext, mUri);
    }

    public boolean canWrite()
    {
        return DocumentsContractApi19.canWrite(mContext, mUri);
    }

    public DocumentFile createDirectory(String s)
    {
        s = DocumentsContractApi21.createDirectory(mContext, mUri, s);
        if (s != null)
        {
            return new TreeDocumentFile(this, mContext, s);
        } else
        {
            return null;
        }
    }

    public DocumentFile createFile(String s, String s1)
    {
        s = DocumentsContractApi21.createFile(mContext, mUri, s, s1);
        if (s != null)
        {
            return new TreeDocumentFile(this, mContext, s);
        } else
        {
            return null;
        }
    }

    public boolean delete()
    {
        return DocumentsContractApi19.delete(mContext, mUri);
    }

    public boolean exists()
    {
        return DocumentsContractApi19.exists(mContext, mUri);
    }

    public String getName()
    {
        return DocumentsContractApi19.getName(mContext, mUri);
    }

    public String getType()
    {
        return DocumentsContractApi19.getType(mContext, mUri);
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDirectory()
    {
        return DocumentsContractApi19.isDirectory(mContext, mUri);
    }

    public boolean isFile()
    {
        return DocumentsContractApi19.isFile(mContext, mUri);
    }

    public long lastModified()
    {
        return DocumentsContractApi19.lastModified(mContext, mUri);
    }

    public long length()
    {
        return DocumentsContractApi19.length(mContext, mUri);
    }

    public DocumentFile[] listFiles()
    {
        Uri auri[] = DocumentsContractApi21.listFiles(mContext, mUri);
        DocumentFile adocumentfile[] = new DocumentFile[auri.length];
        for (int i = 0; i < auri.length; i++)
        {
            adocumentfile[i] = new TreeDocumentFile(this, mContext, auri[i]);
        }

        return adocumentfile;
    }

    public boolean renameTo(String s)
    {
        s = DocumentsContractApi21.renameTo(mContext, mUri, s);
        if (s != null)
        {
            mUri = s;
            return true;
        } else
        {
            return false;
        }
    }
}
