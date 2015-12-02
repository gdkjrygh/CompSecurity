// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.mobileapptracker.MobileAppTracker;
import com.squareup.okhttp.OkHttpClient;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.metrics.analytics.model.RiderEventsProperties;
import com.ubercab.client.core.sms.SmsReceiver;
import com.ubercab.client.core.ui.YearEditText;
import com.ubercab.client.core.vendor.google.gcm.GcmService;
import com.ubercab.client.core.vendor.google.now.NowAuthIntentService;
import com.ubercab.client.feature.music.MusicTrayView;
import com.ubercab.client.feature.music.overlay.AddMusicOverlayView;
import com.ubercab.client.feature.notification.NotificationActionReceiver;
import com.ubercab.client.feature.notification.NotificationBackgroundConnectionService;
import com.ubercab.client.feature.payment.PaymentFooterView;
import com.ubercab.client.feature.payment.alipay.AlipayVerificationCodeReceiver;
import com.ubercab.client.feature.shoppingcart.ShoppingConfirmationView;
import com.ubercab.client.feature.signup.SignupPromoView;
import com.ubercab.client.feature.trip.address.AddressView;
import com.ubercab.client.feature.trip.confirm.ConfirmationView;
import com.ubercab.client.feature.trip.overlay.AccessibilityDeafOverlayView;
import com.ubercab.client.feature.trip.overlay.DestinationTutorialOverlayView;
import com.ubercab.client.feature.trip.overlay.NoLocationOverlayView;
import com.ubercab.client.feature.trip.slider.VehicleSeekBar;
import com.ubercab.client.feature.verification.MobileVerificationIntentService;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.webclient.app.WebClientActivity;
import java.util.concurrent.ExecutorService;

public interface dfp
    extends cpt, czj, djf, glb, gry, hci
{

    public abstract djx A();

    public abstract cyh B();

    public abstract Application C();

    public abstract cev D();

    public abstract bjw E();

    public abstract bjw F();

    public abstract dai G();

    public abstract gju H();

    public abstract cyg I();

    public abstract dzi J();

    public abstract evn K();

    public abstract eww L();

    public abstract evt M();

    public abstract ewg N();

    public abstract ewh O();

    public abstract dkc P();

    public abstract dkd Q();

    public abstract dch R();

    public abstract MobileAppTracker S();

    public abstract efa T();

    public abstract giz U();

    public abstract dwx V();

    public abstract dki W();

    public abstract cys X();

    public abstract dkj Y();

    public abstract cgh Z();

    public abstract void a(RiderApplication riderapplication);

    public abstract void a(RiderEventsProperties ridereventsproperties);

    public abstract void a(SmsReceiver smsreceiver);

    public abstract void a(YearEditText yearedittext);

    public abstract void a(GcmService gcmservice);

    public abstract void a(NowAuthIntentService nowauthintentservice);

    public abstract void a(MusicTrayView musictrayview);

    public abstract void a(AddMusicOverlayView addmusicoverlayview);

    public abstract void a(NotificationActionReceiver notificationactionreceiver);

    public abstract void a(NotificationBackgroundConnectionService notificationbackgroundconnectionservice);

    public abstract void a(com.ubercab.client.feature.payment.BaseAddPaymentV2Fragment.PromoViewFooter promoviewfooter);

    public abstract void a(PaymentFooterView paymentfooterview);

    public abstract void a(AlipayVerificationCodeReceiver alipayverificationcodereceiver);

    public abstract void a(ShoppingConfirmationView shoppingconfirmationview);

    public abstract void a(SignupPromoView signuppromoview);

    public abstract void a(AddressView addressview);

    public abstract void a(ConfirmationView confirmationview);

    public abstract void a(AccessibilityDeafOverlayView accessibilitydeafoverlayview);

    public abstract void a(DestinationTutorialOverlayView destinationtutorialoverlayview);

    public abstract void a(NoLocationOverlayView nolocationoverlayview);

    public abstract void a(VehicleSeekBar vehicleseekbar);

    public abstract void a(MobileVerificationIntentService mobileverificationintentservice);

    public abstract void a(WebClientActivity webclientactivity);

    public abstract void a(dbc dbc);

    public abstract void a(dby dby);

    public abstract void a(gjd gjd);

    public abstract dao aA();

    public abstract UspoutClient aB();

    public abstract ewm aC();

    public abstract dcv aD();

    public abstract cyi aE();

    public abstract cin aF();

    public abstract gqd aG();

    public abstract gqu aH();

    public abstract OkHttpClient aI();

    public abstract grs aJ();

    public abstract grs aK();

    public abstract cxu aL();

    public abstract dqt aM();

    public abstract drc aN();

    public abstract hkr aO();

    public abstract hkr aP();

    public abstract hji aQ();

    public abstract hku aR();

    public abstract hku aS();

    public abstract doy aT();

    public abstract hjk aU();

    public abstract hjm aV();

    public abstract dpb aW();

    public abstract dqx aX();

    public abstract dqw aY();

    public abstract dcr aZ();

    public abstract daj aa();

    public abstract fqg ab();

    public abstract dod ac();

    public abstract dzw ad();

    public abstract hjn ae();

    public abstract dce af();

    public abstract RiderApplication ag();

    public abstract cyy ah();

    public abstract dkn ai();

    public abstract dak aj();

    public abstract eky ak();

    public abstract eyy al();

    public abstract czf am();

    public abstract dcs an();

    public abstract fei ao();

    public abstract dal ap();

    public abstract fim aq();

    public abstract dkq ar();

    public abstract dkr as();

    public abstract dri at();

    public abstract hoc au();

    public abstract dku av();

    public abstract gpt aw();

    public abstract fta ax();

    public abstract fte ay();

    public abstract dkv az();

    public abstract dpg ba();

    public abstract hkm bb();

    public abstract hko bc();

    public abstract hkp bd();

    public abstract hch be();

    public abstract chp e();

    public abstract gmg f();

    public abstract hjo g();

    public abstract ExecutorService h();

    public abstract gqn i();

    public abstract hoi p();

    public abstract djw z();
}
