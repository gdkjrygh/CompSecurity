// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.main:
//            DrawerController, MiscActivity

class this._cls1
    implements com.walmart.android.wmservice.llback
{

    final utString this$1;

    public void onFailure(int i)
    {
    }

    public void onSuccess()
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.lder("signOut")).putString("name", "Navigation"));
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/main/DrawerController$1

/* anonymous class */
    class DrawerController._cls1
        implements DrawerController.DrawerAdapter.OnSecondaryActionClickListener
    {

        final DrawerController this$0;

        public void onSecondaryActionClick(DrawerController.DrawerAdapter.DrawerItem draweritem)
        {
            if (!DrawerController.access$100().equals(draweritem)) goto _L2; else goto _L1
_L1:
            draweritem = Services.get().getAuthentication();
            if (draweritem.hasCredentials())
            {
                draweritem.logout(new DrawerController._cls1._cls1(), true);
                DrawerController.access$200(DrawerController.this, "sign out");
            } else
            {
                draweritem = new Intent(DrawerController.access$300(DrawerController.this), com/walmart/android/app/account/AccountActivity);
                draweritem.putExtra("from", "Nav");
                DrawerController.access$300(DrawerController.this).startActivityForResult(draweritem, 0);
                DrawerController.access$300(DrawerController.this).overridePendingTransition(0x7f05002c, 0x7f050033);
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("signInTap")).putString("name", "Navigation"));
                DrawerController.access$200(DrawerController.this, "sign in");
            }
_L4:
            DrawerController.access$600(DrawerController.this).closeDrawer(DrawerController.access$500(DrawerController.this));
            return;
_L2:
            if (DrawerController.access$400().equals(draweritem))
            {
                draweritem = new Intent(DrawerController.access$300(DrawerController.this), com/walmart/android/app/main/MiscActivity);
                draweritem.putExtra("show", 4).putExtra("EXTRA_STORE_PICKER_OPENED_FROM", "change store");
                DrawerController.access$300(DrawerController.this).startActivity(draweritem);
                DrawerController.access$200(DrawerController.this, "change store");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                this$0 = DrawerController.this;
                super();
            }
    }

}
