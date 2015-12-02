// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ubercab.photo.CameraView;
import com.ubercab.photo.PhotoMask;
import com.ubercab.photo.ReviewControls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class haa extends gkw
    implements gzu
{

    CameraView a;
    hac b;
    hau c;
    private gzs d;
    private int e;
    private int f;
    private PhotoMask g;

    public haa()
    {
    }

    static int a(haa haa1)
    {
        return haa1.f;
    }

    static int b(haa haa1)
    {
        return haa1.e;
    }

    private String b(Uri uri)
    {
        String s = null;
        String as[] = new String[1];
        as[0] = "_data";
        Cursor cursor = getActivity().getContentResolver().query(uri, as, null, null, null);
        if (cursor != null)
        {
            cursor.moveToFirst();
            s = cursor.getString(cursor.getColumnIndex(as[0]));
            cursor.close();
        } else
        if (b != null)
        {
            b.a(gzo.b(String.format("An error occurred with uri : %s", new Object[] {
                uri
            }), null));
            return null;
        }
        return s;
    }

    private static boolean c(Uri uri)
    {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private boolean d()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                break label0;
            }
            Object obj = getActivity().getPackageManager().queryIntentContentProviders(new Intent("android.content.action.DOCUMENTS_PROVIDER"), 0);
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            Object obj1;
            do
            {
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label0;
                    }
                    obj1 = (ResolveInfo)((Iterator) (obj)).next();
                } while (obj1 == null || ((ResolveInfo) (obj1)).providerInfo == null);
                obj1 = ((ResolveInfo) (obj1)).providerInfo.authority;
            } while (!c(Uri.parse((new StringBuilder("content://")).append(((String) (obj1))).toString())));
            return true;
        }
        return false;
    }

    private void e()
    {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(intent, 101);
    }

    private void f()
    {
        startActivityForResult(Intent.createChooser(new Intent("android.intent.action.PICK", android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI), getString(ham.ub__photo__choose_image_source)), 100);
    }

    private void g()
    {
        if (a != null && getActivity() != null)
        {
            ArrayList arraylist = new ArrayList(2);
            if (!c.a("android.permission.CAMERA"))
            {
                arraylist.add("android.permission.CAMERA");
            }
            if (!c.a("android.permission.WRITE_EXTERNAL_STORAGE") && gzz.b.equals(getArguments().getSerializable("camera_view_fragment.bundle.storage")))
            {
                arraylist.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (arraylist.isEmpty())
            {
                a.k();
            } else
            if (getActivity().getFragmentManager().findFragmentByTag(hat.getName()) == null)
            {
                hau.a(this, (String[])arraylist.toArray(new String[arraylist.size()]));
                return;
            }
        }
    }

    public final void a()
    {
        if (b != null)
        {
            b.a(gzo.c("No camera available."));
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setMessage(ham.ub__photo__camera_error);
        builder.setNegativeButton(ham.ub__photo__ok, new _cls3());
        builder.setOnCancelListener(new _cls4());
        builder.show();
    }

    public final void a(int i)
    {
        if (i == gzy.a)
        {
            a.f();
        }
        if (b != null)
        {
            b.f();
        }
    }

    public final void a(Uri uri)
    {
        if (b != null)
        {
            b.a(uri);
        }
    }

    public final void a(gzo gzo1)
    {
        if (b != null)
        {
            b.a(gzo1);
        }
    }

    public final void a(gzs gzs1)
    {
        d = gzs1;
    }

    public final void a(hac hac1)
    {
        b = hac1;
    }

    public final void b()
    {
        boolean flag = d();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e();
_L2:
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        f();
        return;
        activitynotfoundexception;
        if (b == null) goto _L2; else goto _L1
_L1:
        b.a(gzo.b("Unable to open gallery.", activitynotfoundexception));
        if (getActivity() == null) goto _L2; else goto _L3
_L3:
        Toast.makeText(getActivity(), getString(ham.ub__photo__gallery_error), 1).show();
        return;
        f();
        return;
    }

    public final CameraView c()
    {
        return a;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i != 100 || j != -1 || intent == null) goto _L2; else goto _L1
_L1:
        intent = b(intent.getData());
        if (intent == null) goto _L4; else goto _L3
_L3:
        (new _cls1()).execute(new String[] {
            intent
        });
_L6:
        return;
_L4:
        cwm.a(getActivity(), ham.ub__photo__photo_cloud_error);
        return;
_L2:
        if (i == 101 && j == -1 && intent != null)
        {
            (new _cls2()).execute(new Uri[] {
                intent.getData()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new hau(getActivity().getApplication());
        View view = layoutinflater.inflate(hal.ub__photo_fragment_take_photo, viewgroup, false);
        f = getArguments().getInt("camera_view_fragment.bundle.max_out_width", 400);
        e = getArguments().getInt("camera_view_fragment.bundle.max_out_heigth", 400);
        int i = getArguments().getInt("camera_view_fragment.bundle.target_width", 2000);
        int j = getArguments().getInt("camera_view_fragment.bundle.target_height", 2000);
        a = (CameraView)view.findViewById(hak.ub__photo_cameraview);
        a.a(getArguments().getBoolean("camera_view_fragment.bundle.prefer_front_camera", false));
        a.b(f, e);
        a.a(i, j);
        viewgroup = (gzv)getArguments().getSerializable("camera_view_fragment.bundle.face_detection_mode");
        if (viewgroup != null)
        {
            a.a(viewgroup);
        }
        viewgroup = (gzx)getArguments().getSerializable("camera_view_fragment.bundle.light_detection_mode");
        if (viewgroup != null)
        {
            a.a(viewgroup);
        }
        boolean flag = getArguments().getBoolean("camera_view_fragment.bundle.enable_photo_gallery", true);
        boolean flag1 = getArguments().getBoolean("camera_view_fragment.bundle.enable_camera_rotate", true);
        viewgroup = a.g();
        if (viewgroup != null)
        {
            viewgroup.a(getArguments().getString("camera_view_fragment.bundle.hint_text"));
            if (!flag)
            {
                viewgroup.b();
            }
            if (!flag1)
            {
                viewgroup.a();
            }
        }
        a.b(getArguments().getInt("camera_view_fragment.bundle.jpeg_quality", 90));
        if (a.i() != null)
        {
            a.i().a(getArguments().getString("camera_view_fragment.bundle.review_hint_text"));
            a.i().a(getArguments().getInt("camera_view_fragment.bundle_accept_text_res_id", ham.ub__photo__save));
            a.i().b(getArguments().getInt("camera_view_fragment.bundle_dismiss_text_res_id", ham.ub__photo__retake));
        }
        a.a((gzz)getArguments().getSerializable("camera_view_fragment.bundle.storage"));
        a.b(getArguments().getBoolean("camera_view_fragment.bundle.should_use_renderscript", false));
        bundle = (hae)getArguments().getSerializable("camera_view_fragment.bundle.shape");
        viewgroup = bundle;
        if (bundle == null)
        {
            viewgroup = hae.a;
        }
        if (getArguments().containsKey("camera_view_fragment.bundle.color"))
        {
            bundle = new had(viewgroup, getArguments().getInt("camera_view_fragment.bundle.color"));
        } else
        {
            bundle = new had(viewgroup);
        }
        bundle.a(getResources().getDimensionPixelSize(hai.ub__shape_stroke_width));
        g = (new PhotoMask(layoutinflater.getContext())).a(bundle);
        a.a(g);
        layoutinflater = new had(viewgroup, getResources().getColor(hah.ub__white));
        layoutinflater.b();
        ((ReviewControls)a.i()).a(layoutinflater);
        a.a(this);
        a.a(d);
        if (b == null || d == null)
        {
            getActivity().finish();
        }
        return view;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (g != null)
        {
            g.a(null);
        }
        if (a.i() != null)
        {
            a.i().a();
        }
        if (a != null)
        {
            a.a(null);
        }
        d = null;
    }

    public void onPause()
    {
        super.onPause();
        if (a != null)
        {
            a.j();
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        super.onRequestPermissionsResult(i, as, ai);
        if (i == 100)
        {
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            i = 0;
            while (i < as.length) 
            {
                if (ai[i] == -1)
                {
                    arraylist.add(as[i]);
                } else
                {
                    arraylist1.add(as[i]);
                }
                i++;
            }
            if (!arraylist.isEmpty())
            {
                as = has.a((String)arraylist.get(0));
                hau.a(getActivity(), as, d);
                d.h();
                d.a(arraylist);
            }
            if (!arraylist1.isEmpty())
            {
                d.b(arraylist1);
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        g();
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
