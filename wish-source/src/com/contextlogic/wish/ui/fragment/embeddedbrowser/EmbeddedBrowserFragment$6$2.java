// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.webkit.ValueCallback;
import com.contextlogic.wish.api.service.UploadImageService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.webview.InterceptingTouchWebView;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.FileUtil;

// Referenced classes of package com.contextlogic.wish.ui.fragment.embeddedbrowser:
//            EmbeddedBrowserFragment

class this._cls1
    implements com.contextlogic.wish.api.service.serFragment._cls6._cls2
{

    final ctivity this$1;

    public void onServiceFailed()
    {
        EmbeddedBrowserFragment.access$700(_fld0);
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f06017e));
    }

    l.id()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/embeddedbrowser/EmbeddedBrowserFragment$6

/* anonymous class */
    class EmbeddedBrowserFragment._cls6
        implements ValueCallback
    {

        final EmbeddedBrowserFragment this$0;
        final String val$id;
        final RootActivity val$rootActivity;

        public void onReceiveValue(Uri uri)
        {
            EmbeddedBrowserFragment.access$500(EmbeddedBrowserFragment.this);
            Object obj = null;
            try
            {
                uri = BitmapUtil.decodeBitmapFile(FileUtil.getPath(rootActivity, uri), 1024, 1024);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri = obj;
            }
            if (uri == null)
            {
                EmbeddedBrowserFragment.access$600(EmbeddedBrowserFragment.this);
                EmbeddedBrowserFragment.access$700(EmbeddedBrowserFragment.this);
                return;
            } else
            {
                EmbeddedBrowserFragment.access$900(EmbeddedBrowserFragment.this).requestService(uri, "ticket-image-uploads", new EmbeddedBrowserFragment._cls6._cls1(), new EmbeddedBrowserFragment._cls6._cls2());
                return;
            }
        }

        public volatile void onReceiveValue(Object obj)
        {
            onReceiveValue((Uri)obj);
        }

            
            {
                this$0 = final_embeddedbrowserfragment;
                rootActivity = rootactivity;
                id = String.this;
                super();
            }

        // Unreferenced inner class com/contextlogic/wish/ui/fragment/embeddedbrowser/EmbeddedBrowserFragment$6$1

/* anonymous class */
        class EmbeddedBrowserFragment._cls6._cls1
            implements com.contextlogic.wish.api.service.UploadImageService.SuccessCallback
        {

            final EmbeddedBrowserFragment._cls6 this$1;

            public void onServiceSucceeded(String s, String s1)
            {
                EmbeddedBrowserFragment.access$700(this$0);
                s = String.format("javascript:$(window).trigger('imageUrlReceived',['%s', '%s', '%s']);", new Object[] {
                    id, s, s1
                });
                EmbeddedBrowserFragment.access$800(this$0).loadUrl(s);
            }

                    
                    {
                        this$1 = EmbeddedBrowserFragment._cls6.this;
                        super();
                    }
        }

    }

}
