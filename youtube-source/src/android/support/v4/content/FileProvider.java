// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//            b, c

public class FileProvider extends ContentProvider
{

    private static final String a[] = {
        "_display_name", "_size"
    };
    private static final File b = new File("/");
    private static HashMap c = new HashMap();
    private b d;

    public FileProvider()
    {
    }

    public static Uri a(Context context, String s, File file)
    {
        return a(context, s).a(file);
    }

    private static b a(Context context, String s)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj1 = (b)c.get(s);
        Object obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        XmlResourceParser xmlresourceparser;
        obj1 = new c(s);
        xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlresourceparser != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
        context;
        hashmap;
        JVM INSTR monitorexit ;
        throw context;
_L6:
        int i = xmlresourceparser.next();
        if (i == 1) goto _L4; else goto _L3
_L3:
        if (i != 2) goto _L6; else goto _L5
_L5:
        String s1;
        String s2;
        obj = xmlresourceparser.getName();
        s1 = xmlresourceparser.getAttributeValue(null, "name");
        s2 = xmlresourceparser.getAttributeValue(null, "path");
        if (!"root-path".equals(obj)) goto _L8; else goto _L7
_L7:
        obj = a(b, new String[] {
            s2
        });
_L12:
        if (obj == null) goto _L6; else goto _L9
_L9:
        ((c) (obj1)).a(s1, ((File) (obj)));
          goto _L6
        context;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", context);
_L8:
        if (!"files-path".equals(obj)) goto _L11; else goto _L10
_L10:
        obj = a(context.getFilesDir(), new String[] {
            s2
        });
          goto _L12
_L11:
label0:
        {
            if (!"cache-path".equals(obj))
            {
                break label0;
            }
            obj = a(context.getCacheDir(), new String[] {
                s2
            });
        }
          goto _L12
        if (!"external-path".equals(obj))
        {
            break MISSING_BLOCK_LABEL_295;
        }
        obj = a(Environment.getExternalStorageDirectory(), new String[] {
            s2
        });
          goto _L12
_L4:
        c.put(s, obj1);
        obj = obj1;
_L2:
        hashmap;
        JVM INSTR monitorexit ;
        return ((b) (obj));
        obj = null;
          goto _L12
    }

    private static transient File a(File file, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s != null)
            {
                file = new File(file, s);
            }
        }

        return file;
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        if (providerinfo.exported)
        {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerinfo.grantUriPermissions)
        {
            throw new SecurityException("Provider must grant uri permissions");
        } else
        {
            d = a(context, providerinfo.authority);
            return;
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        return !d.a(uri).delete() ? 0 : 1;
    }

    public String getType(Uri uri)
    {
        uri = d.a(uri);
        int i = uri.getName().lastIndexOf('.');
        if (i >= 0)
        {
            uri = uri.getName().substring(i + 1);
            uri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uri);
            if (uri != null)
            {
                return uri;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        uri = d.a(uri);
        int i;
        if ("r".equals(s))
        {
            i = 0x10000000;
        } else
        if ("w".equals(s) || "wt".equals(s))
        {
            i = 0x2c000000;
        } else
        if ("wa".equals(s))
        {
            i = 0x2a000000;
        } else
        if ("rw".equals(s))
        {
            i = 0x38000000;
        } else
        if ("rwt".equals(s))
        {
            i = 0x3c000000;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid mode: ")).append(s).toString());
        }
        return ParcelFileDescriptor.open(uri, i);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        s = d.a(uri);
        uri = as;
        if (as == null)
        {
            uri = a;
        }
        as1 = new String[uri.length];
        as = ((String []) (new Object[uri.length]));
        int i1 = uri.length;
        int j = 0;
        int i = 0;
        while (j < i1) 
        {
            s1 = uri[j];
            if ("_display_name".equals(s1))
            {
                as1[i] = "_display_name";
                int k = i + 1;
                as[i] = s.getName();
                i = k;
            } else
            if ("_size".equals(s1))
            {
                as1[i] = "_size";
                int l = i + 1;
                as[i] = Long.valueOf(s.length());
                i = l;
            }
            j++;
        }
        uri = new String[i];
        System.arraycopy(as1, 0, uri, 0, i);
        s = ((String) (new Object[i]));
        System.arraycopy(as, 0, s, 0, i);
        uri = new MatrixCursor(uri, 1);
        uri.addRow(s);
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("No external updates");
    }

}
