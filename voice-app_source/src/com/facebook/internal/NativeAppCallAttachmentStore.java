// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//            Utility, Validate

public final class NativeAppCallAttachmentStore
{
    public static final class Attachment
    {

        private final String attachmentName;
        private final String attachmentUrl;
        private Bitmap bitmap;
        private final UUID callId;
        private boolean isContentUri;
        private Uri originalUri;
        private boolean shouldCreateFile;

        public String getAttachmentUrl()
        {
            return attachmentUrl;
        }







        private Attachment(UUID uuid, Bitmap bitmap1, Uri uri)
        {
            boolean flag;
            flag = true;
            super();
            callId = uuid;
            bitmap = bitmap1;
            originalUri = uri;
            if (uri == null)
            {
                break MISSING_BLOCK_LABEL_162;
            }
            bitmap1 = uri.getScheme();
            if (!"content".equalsIgnoreCase(bitmap1)) goto _L2; else goto _L1
_L1:
            isContentUri = true;
            if (uri.getAuthority() == null || uri.getAuthority().startsWith("media"))
            {
                flag = false;
            }
            shouldCreateFile = flag;
_L5:
            if (!shouldCreateFile)
            {
                bitmap1 = null;
            } else
            {
                bitmap1 = UUID.randomUUID().toString();
            }
            attachmentName = bitmap1;
            if (!shouldCreateFile)
            {
                uuid = originalUri.toString();
            } else
            {
                uuid = FacebookContentProvider.getAttachmentUrl(FacebookSdk.getApplicationId(), uuid, attachmentName);
            }
            attachmentUrl = uuid;
            return;
_L2:
            if (!"file".equalsIgnoreCase(uri.getScheme())) goto _L4; else goto _L3
_L3:
            shouldCreateFile = true;
              goto _L5
_L4:
            if (Utility.isWebUri(uri)) goto _L5; else goto _L6
_L6:
            throw new FacebookException((new StringBuilder("Unsupported scheme for media Uri : ")).append(bitmap1).toString());
            if (bitmap1 != null)
            {
                shouldCreateFile = true;
            } else
            {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
              goto _L5
        }

        Attachment(UUID uuid, Bitmap bitmap1, Uri uri, Attachment attachment)
        {
            this(uuid, bitmap1, uri);
        }
    }


    static final String ATTACHMENTS_DIR_NAME = "com.facebook.NativeAppCallAttachmentStore.files";
    private static final String TAG = com/facebook/internal/NativeAppCallAttachmentStore.getName();
    private static File attachmentsDirectory;

    private NativeAppCallAttachmentStore()
    {
    }

    public static void addAttachments(Collection collection)
    {
        if (collection != null && collection.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (attachmentsDirectory == null)
        {
            cleanupAllAttachments();
        }
        ensureAttachmentsDirectoryExists();
        obj = new ArrayList();
        collection = collection.iterator();
_L5:
        if (!collection.hasNext()) goto _L1; else goto _L3
_L3:
        Attachment attachment = (Attachment)collection.next();
        if (!attachment.shouldCreateFile) goto _L5; else goto _L4
_L4:
        File file1;
        file1 = getAttachmentFile(attachment.callId, attachment.attachmentName, true);
        ((List) (obj)).add(file1);
        if (attachment.bitmap == null) goto _L7; else goto _L6
_L6:
        processAttachmentBitmap(attachment.bitmap, file1);
          goto _L5
        collection;
        Log.e(TAG, (new StringBuilder("Got unexpected exception:")).append(collection).toString());
        obj = ((List) (obj)).iterator();
_L9:
        if (!((Iterator) (obj)).hasNext())
        {
            throw new FacebookException(collection);
        }
        break MISSING_BLOCK_LABEL_178;
_L7:
        if (attachment.originalUri == null) goto _L5; else goto _L8
_L8:
        processAttachmentFile(attachment.originalUri, attachment.isContentUri, file1);
          goto _L5
        File file = (File)((Iterator) (obj)).next();
        try
        {
            file.delete();
        }
        catch (Exception exception) { }
          goto _L9
    }

    public static void cleanupAllAttachments()
    {
        Utility.deleteDirectory(getAttachmentsDirectory());
    }

    public static void cleanupAttachmentsForCall(UUID uuid)
    {
        uuid = getAttachmentsDirectoryForCall(uuid, false);
        if (uuid != null)
        {
            Utility.deleteDirectory(uuid);
        }
    }

    public static Attachment createAttachment(UUID uuid, Bitmap bitmap)
    {
        Validate.notNull(uuid, "callId");
        Validate.notNull(bitmap, "attachmentBitmap");
        return new Attachment(uuid, bitmap, null, null);
    }

    public static Attachment createAttachment(UUID uuid, Uri uri)
    {
        Validate.notNull(uuid, "callId");
        Validate.notNull(uri, "attachmentUri");
        return new Attachment(uuid, null, uri, null);
    }

    static File ensureAttachmentsDirectoryExists()
    {
        File file = getAttachmentsDirectory();
        file.mkdirs();
        return file;
    }

    static File getAttachmentFile(UUID uuid, String s, boolean flag)
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

    static File getAttachmentsDirectory()
    {
        com/facebook/internal/NativeAppCallAttachmentStore;
        JVM INSTR monitorenter ;
        File file;
        if (attachmentsDirectory == null)
        {
            attachmentsDirectory = new File(FacebookSdk.getApplicationContext().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
        }
        file = attachmentsDirectory;
        com/facebook/internal/NativeAppCallAttachmentStore;
        JVM INSTR monitorexit ;
        return file;
        Exception exception;
        exception;
        throw exception;
    }

    static File getAttachmentsDirectoryForCall(UUID uuid, boolean flag)
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

    public static File openAttachment(UUID uuid, String s)
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

    private static void processAttachmentBitmap(Bitmap bitmap, File file)
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

    private static void processAttachmentFile(Uri uri, boolean flag, File file)
        throws IOException
    {
        file = new FileOutputStream(file);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        uri = new FileInputStream(uri.getPath());
_L1:
        Utility.copyAndCloseInputStream(uri, file);
        Utility.closeQuietly(file);
        return;
        uri = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri);
          goto _L1
        uri;
        Utility.closeQuietly(file);
        throw uri;
    }

}
