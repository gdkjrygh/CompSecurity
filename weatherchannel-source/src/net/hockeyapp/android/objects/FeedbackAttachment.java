// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import net.hockeyapp.android.Constants;

public class FeedbackAttachment
    implements Serializable
{

    private static final long serialVersionUID = 0x46377e116a891f9eL;
    private String createdAt;
    private String filename;
    private int id;
    private int messageId;
    private String updatedAt;
    private String url;

    public FeedbackAttachment()
    {
    }

    public String getCacheId()
    {
        return (new StringBuilder()).append("").append(messageId).append(id).toString();
    }

    public String getCreatedAt()
    {
        return createdAt;
    }

    public String getFilename()
    {
        return filename;
    }

    public int getId()
    {
        return id;
    }

    public int getMessageId()
    {
        return messageId;
    }

    public String getUpdatedAt()
    {
        return updatedAt;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isAvailableInCache()
    {
        File file = Constants.getHockeyAppStorageDir();
        if (file.exists() && file.isDirectory())
        {
            File afile[] = file.listFiles(new FilenameFilter() {

                final FeedbackAttachment this$0;

                public boolean accept(File file1, String s)
                {
                    return s.equals(getCacheId());
                }

            
            {
                this$0 = FeedbackAttachment.this;
                super();
            }
            });
            return afile != null && afile.length == 1;
        } else
        {
            return false;
        }
    }

    public void setCreatedAt(String s)
    {
        createdAt = s;
    }

    public void setFilename(String s)
    {
        filename = s;
    }

    public void setId(int i)
    {
        id = i;
    }

    public void setMessageId(int i)
    {
        messageId = i;
    }

    public void setUpdatedAt(String s)
    {
        updatedAt = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("\n").append(net/hockeyapp/android/objects/FeedbackAttachment.getSimpleName()).append("\n").append("id         ").append(id).append("\n").append("message id ").append(messageId).append("\n").append("filename   ").append(filename).append("\n").append("url        ").append(url).append("\n").append("createdAt  ").append(createdAt).append("\n").append("updatedAt  ").append(updatedAt).toString();
    }
}
