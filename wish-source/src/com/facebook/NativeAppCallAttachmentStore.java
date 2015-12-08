// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.facebook:
//            FacebookException

public final class NativeAppCallAttachmentStore
    implements NativeAppCallContentProvider.AttachmentDataSource
{
    static interface ProcessAttachment
    {

        public abstract void processAttachment(Object obj, File file)
            throws IOException;
    }


    static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    private static final String TAG = com/facebook/NativeAppCallAttachmentStore.getName();
    private static File attachmentsDirectory;

    public NativeAppCallAttachmentStore()
    {
    }

    private void addAttachments(Context context, UUID uuid, Map map, ProcessAttachment processattachment)
    {
        if (map.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (attachmentsDirectory == null)
        {
            cleanupAllAttachments(context);
        }
        ensureAttachmentsDirectoryExists(context);
        context = new ArrayList();
        try
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                Object obj1 = (java.util.Map.Entry)map.next();
                Object obj = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                obj = getAttachmentFile(uuid, ((String) (obj)), true);
                context.add(obj);
                processattachment.processAttachment(obj1, ((File) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            Log.e(TAG, (new StringBuilder()).append("Got unexpected exception:").append(uuid).toString());
            for (context = context.iterator(); context.hasNext();)
            {
                map = (File)context.next();
                try
                {
                    map.delete();
                }
                // Misplaced declaration of an exception variable
                catch (Map map) { }
            }

            throw new FacebookException(uuid);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static File getAttachmentsDirectory(Context context)
    {
        com/facebook/NativeAppCallAttachmentStore;
        JVM INSTR monitorenter ;
        if (attachmentsDirectory == null)
        {
            attachmentsDirectory = new File(context.getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        context = attachmentsDirectory;
        com/facebook/NativeAppCallAttachmentStore;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void addAttachmentFilesForCall(Context context, UUID uuid, Map map)
    {
        Validate.notNull(context, "context");
        Validate.notNull(uuid, "callId");
        Validate.containsNoNulls(map.values(), "imageAttachmentFiles");
        Validate.containsNoNullOrEmpty(map.keySet(), "imageAttachmentFiles");
        addAttachments(context, uuid, map, new ProcessAttachment() {

            final NativeAppCallAttachmentStore this$0;

            public void processAttachment(File file, File file1)
                throws IOException
            {
                FileOutputStream fileoutputstream;
                fileoutputstream = new FileOutputStream(file1);
                file1 = null;
                file = new FileInputStream(file);
                file1 = new byte[1024];
_L3:
                int i = file.read(file1);
                if (i <= 0) goto _L2; else goto _L1
_L1:
                fileoutputstream.write(file1, 0, i);
                  goto _L3
                file1;
_L5:
                Utility.closeQuietly(fileoutputstream);
                Utility.closeQuietly(file);
                throw file1;
_L2:
                Utility.closeQuietly(fileoutputstream);
                Utility.closeQuietly(file);
                return;
                Exception exception;
                exception;
                file = file1;
                file1 = exception;
                if (true) goto _L5; else goto _L4
_L4:
            }

            public volatile void processAttachment(Object obj, File file)
                throws IOException
            {
                processAttachment((File)obj, file);
            }

            
            {
                this$0 = NativeAppCallAttachmentStore.this;
                super();
            }
        });
    }

    public void addAttachmentsForCall(Context context, UUID uuid, Map map)
    {
        Validate.notNull(context, "context");
        Validate.notNull(uuid, "callId");
        Validate.containsNoNulls(map.values(), "imageAttachments");
        Validate.containsNoNullOrEmpty(map.keySet(), "imageAttachments");
        addAttachments(context, uuid, map, new ProcessAttachment() {

            final NativeAppCallAttachmentStore this$0;

            public void processAttachment(Bitmap bitmap, File file)
                throws IOException
            {
                file = new FileOutputStream(file);
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, file);
                Utility.closeQuietly(file);
                return;
                bitmap;
                Utility.closeQuietly(file);
                throw bitmap;
            }

            public volatile void processAttachment(Object obj, File file)
                throws IOException
            {
                processAttachment((Bitmap)obj, file);
            }

            
            {
                this$0 = NativeAppCallAttachmentStore.this;
                super();
            }
        });
    }

    void cleanupAllAttachments(Context context)
    {
        Utility.deleteDirectory(getAttachmentsDirectory(context));
    }

    public void cleanupAttachmentsForCall(Context context, UUID uuid)
    {
        Utility.deleteDirectory(getAttachmentsDirectoryForCall(uuid, false));
    }

    File ensureAttachmentsDirectoryExists(Context context)
    {
        context = getAttachmentsDirectory(context);
        context.mkdirs();
        return context;
    }

    File getAttachmentFile(UUID uuid, String s, boolean flag)
        throws IOException
    {
        uuid = getAttachmentsDirectoryForCall(uuid, flag);
        if (uuid == null)
        {
            return null;
        }
        try
        {
            uuid = new File(uuid, URLEncoder.encode(s, "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            return null;
        }
        return uuid;
    }

    File getAttachmentsDirectoryForCall(UUID uuid, boolean flag)
    {
        if (attachmentsDirectory == null)
        {
            uuid = null;
        } else
        {
            File file = new File(attachmentsDirectory, uuid.toString());
            uuid = file;
            if (flag)
            {
                uuid = file;
                if (!file.exists())
                {
                    file.mkdirs();
                    return file;
                }
            }
        }
        return uuid;
    }

    public File openAttachment(UUID uuid, String s)
        throws FileNotFoundException
    {
        if (Utility.isNullOrEmpty(s) || uuid == null)
        {
            throw new FileNotFoundException();
        }
        try
        {
            uuid = getAttachmentFile(uuid, s, false);
        }
        // Misplaced declaration of an exception variable
        catch (UUID uuid)
        {
            throw new FileNotFoundException();
        }
        return uuid;
    }

}
