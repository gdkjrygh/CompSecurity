.class public Lcom/nbcuni/nbc/thevoice/MainActivity;
.super Lcom/comscore/instrumentation/InstrumentedActivity;
.source "MainActivity.java"


# static fields
.field private static PERMISSIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static popupOpened:Z


# instance fields
.field private DNSDialog:Landroid/app/Dialog;

.field DNSDialogActive:Z

.field private OSVersion:Ljava/lang/String;

.field public VERSION:I

.field final assets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field backendResponse:Lorg/json/JSONObject;

.field backendTimeZone:Ljava/lang/String;

.field backendUrl:Ljava/lang/String;

.field private final broadcastReceiver:Landroid/content/BroadcastReceiver;

.field callbackManager:Lcom/facebook/CallbackManager;

.field private connectionDialog:Landroid/app/Dialog;

.field private final context:Landroid/content/Context;

.field private deviceCapability:Ljava/lang/String;

.field private endOfShowDialog:Landroid/app/Dialog;

.field private final filter:Landroid/content/IntentFilter;

.field private fis:Ljava/io/FileInputStream;

.field gatekeeperTimestamp:J

.field private httpTask:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Void;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final jsListener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

.field private loadTimer:Landroid/os/CountDownTimer;

.field private loginCmdID:I

.field private loginSubject:Ljava/lang/String;

.field mediaPaused:Z

.field private mediaPlayer:Landroid/media/MediaPlayer;

.field mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

.field private quitDialog:Landroid/app/Dialog;

.field public quitDialogOpen:Z

.field private resumeCounter:I

.field private shareDialog:Lcom/facebook/share/widget/ShareDialog;

.field private sharedPrefs:Landroid/content/SharedPreferences;

.field private splashShown:Z

.field private updateDialog:Landroid/app/Dialog;

.field private webURL:Ljava/lang/String;

.field private webView:Landroid/webkit/WebView;

.field private wl:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    sput-boolean v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->popupOpened:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 41
    invoke-direct {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;-><init>()V

    .line 48
    iput-object p0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    .line 55
    iput-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 60
    const-string v0, "0"

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->deviceCapability:Ljava/lang/String;

    .line 64
    iput v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->resumeCounter:I

    .line 68
    iput-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPaused:Z

    .line 78
    iput-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialogOpen:Z

    .line 80
    new-array v0, v1, [Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->assets:Ljava/util/List;

    .line 83
    new-instance v0, Lcom/nbcuni/nbc/thevoice/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$1;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->jsListener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    .line 426
    new-instance v0, Lcom/nbcuni/nbc/thevoice/MainActivity$2;

    invoke-direct {v0, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$2;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    .line 451
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->filter:Landroid/content/IntentFilter;

    .line 41
    return-void
.end method

.method static synthetic access$0(Ljava/util/List;)V
    .locals 0

    .prologue
    .line 73
    sput-object p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->PERMISSIONS:Ljava/util/List;

    return-void
.end method

.method static synthetic access$1(Lcom/nbcuni/nbc/thevoice/MainActivity;I)V
    .locals 0

    .prologue
    .line 74
    iput p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loginCmdID:I

    return-void
.end method

.method static synthetic access$10(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/media/MediaPlayer;)V
    .locals 0

    .prologue
    .line 66
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    return-void
.end method

.method static synthetic access$11(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/io/FileInputStream;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;

    return-object v0
.end method

.method static synthetic access$12(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/io/FileInputStream;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->fis:Ljava/io/FileInputStream;

    return-void
.end method

.method static synthetic access$13(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/SharedPreferences;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic access$14(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    return-object v0
.end method

.method static synthetic access$15(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$16(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/os/AsyncTask;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->httpTask:Landroid/os/AsyncTask;

    return-void
.end method

.method static synthetic access$17(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webURL:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$18(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/BroadcastReceiver;
    .locals 1

    .prologue
    .line 426
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    return-object v0
.end method

.method static synthetic access$19(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$2(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loginSubject:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$20(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$21(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$22(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic access$23(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1534
    invoke-direct {p0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->openAppStore(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$24(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->OSVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$25(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->deviceCapability:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$26(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/os/CountDownTimer;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;

    return-object v0
.end method

.method static synthetic access$27(Lcom/nbcuni/nbc/thevoice/MainActivity;Landroid/os/CountDownTimer;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;

    return-void
.end method

.method static synthetic access$3(Lcom/nbcuni/nbc/thevoice/MainActivity;ILjava/util/List;)V
    .locals 0

    .prologue
    .line 1508
    invoke-direct {p0, p1, p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->onClickLogin(ILjava/util/List;)V

    return-void
.end method

.method static synthetic access$4(Lcom/nbcuni/nbc/thevoice/MainActivity;)I
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loginCmdID:I

    return v0
.end method

.method static synthetic access$5(Lcom/nbcuni/nbc/thevoice/MainActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loginSubject:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$6(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1513
    invoke-direct {p0, p1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->onClickLogout(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$7(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 1498
    invoke-direct {p0, p1, p2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$8(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$9(Lcom/nbcuni/nbc/thevoice/MainActivity;)Landroid/media/MediaPlayer;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method private capitalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 1024
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 1025
    :cond_0
    const-string p1, ""

    .line 1031
    .end local p1    # "s":Ljava/lang/String;
    :cond_1
    :goto_0
    return-object p1

    .line 1027
    .restart local p1    # "s":Ljava/lang/String;
    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 1028
    .local v0, "first":C
    invoke-static {v0}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1031
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0
.end method

.method private createWebView()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 1037
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v3, 0x7f08004c

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webURL:Ljava/lang/String;

    .line 1039
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    .line 1040
    .local v1, "webSettings":Landroid/webkit/WebSettings;
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1041
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 1042
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 1043
    .local v0, "appCachePath":Ljava/lang/String;
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 1044
    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 1045
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 1046
    invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 1047
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 1048
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    .line 1049
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ge v2, v3, :cond_0

    .line 1050
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/data/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/database"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 1051
    :cond_0
    invoke-virtual {v1, v5}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 1052
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt v2, v3, :cond_1

    .line 1053
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v2

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v2, v3, v5}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 1054
    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 1057
    :cond_1
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->jsListener:Lcom/nbcuni/nbc/thevoice/JavaScriptListener;

    invoke-direct {v3, p0, v4}, Lcom/nbcuni/nbc/thevoice/JavaScriptHandler;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Lcom/nbcuni/nbc/thevoice/JavaScriptListener;)V

    const-string v4, "NBCHandler"

    invoke-virtual {v2, v3, v4}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1059
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    invoke-direct {v3, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 1266
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    new-instance v3, Lcom/nbcuni/nbc/thevoice/MainActivity$14;

    invoke-direct {v3, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$14;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1487
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    invoke-virtual {p0, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getConnectionStatus(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1488
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    const-string v3, "about:blank"

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1489
    iput-boolean v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 1490
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showConnectionDialog()V

    .line 1496
    :goto_0
    return-void

    .line 1493
    :cond_2
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webURL:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "?wrapper=1"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private isSubsetOf(Ljava/util/Collection;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 1500
    .local p1, "subset":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .local p2, "superset":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1505
    const/4 v1, 0x1

    :goto_0
    return v1

    .line 1500
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1501
    .local v0, "string":Ljava/lang/String;
    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1502
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private onClickLogin(ILjava/util/List;)V
    .locals 1
    .param p1, "commandId"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1510
    .local p2, "loginPermissions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    invoke-virtual {v0, p0, p2}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    .line 1511
    return-void
.end method

.method private onClickLogout(Ljava/lang/String;)V
    .locals 3
    .param p1, "commandId"    # Ljava/lang/String;

    .prologue
    .line 1515
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/login/LoginManager;->logOut()V

    .line 1517
    new-instance v1, Lcom/nbcuni/nbc/thevoice/MainActivity$15;

    invoke-direct {v1, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$15;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {p0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1527
    iget-object v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "fbAuthToken"

    invoke-interface {v1, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1528
    if-eqz p1, :cond_0

    .line 1529
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{\"commandId\":\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\",\"type\":\"CommandResult\",\"subject\":\"FacebookLogout\"}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1530
    .local v0, "commandResult":Ljava/lang/String;
    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 1532
    .end local v0    # "commandResult":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method private openAppStore(Ljava/lang/String;)V
    .locals 2
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 1536
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1537
    .local v0, "intent":Landroid/content/Intent;
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1538
    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1539
    return-void
.end method

.method private setMixPanelProperties(I)V
    .locals 14
    .param p1, "state"    # I

    .prologue
    const/4 v13, 0x7

    .line 1543
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v11}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v1

    .line 1544
    .local v1, "calendar":Ljava/util/Calendar;
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v11, "HH:mm"

    invoke-direct {v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1545
    .local v10, "sdf":Ljava/text/SimpleDateFormat;
    const/4 v2, 0x0

    .line 1546
    .local v2, "dayOfTheWeek":I
    invoke-virtual {v1, v13}, Ljava/util/Calendar;->get(I)I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_0

    .line 1547
    const/4 v2, 0x7

    .line 1551
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 1615
    :goto_1
    return-void

    .line 1549
    :cond_0
    invoke-virtual {v1, v13}, Ljava/util/Calendar;->get(I)I

    move-result v11

    add-int/lit8 v2, v11, -0x1

    goto :goto_0

    .line 1554
    :pswitch_0
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    invoke-interface {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->getDistinctId()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_1

    .line 1555
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    iget-object v12, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v12}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getDistinctId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->identify(Ljava/lang/String;)V

    .line 1556
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    const-string v12, "Platform"

    const-string v13, "Android"

    invoke-interface {v11, v12, v13}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1557
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    const-string v12, "Product"

    const-string v13, "The Voice App"

    invoke-interface {v11, v12, v13}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1559
    :cond_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 1560
    .local v7, "launchProps":Lorg/json/JSONObject;
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v12, "MPfirstLaunchDate"

    const/4 v13, 0x0

    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_2

    .line 1561
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 1562
    .local v4, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v11, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-direct {v5, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1563
    .local v5, "firstDate":Ljava/text/SimpleDateFormat;
    const-string v11, "MPfirstLaunchDate"

    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v12}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v4, v11, v12}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1564
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1566
    :try_start_0
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5, v11}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    .line 1567
    .local v6, "firstLaunchDate":Ljava/lang/String;
    const-string v11, "Platform"

    const-string v12, "Android"

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1568
    const-string v11, "Product"

    const-string v12, "The Voice App"

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1569
    const-string v11, "First App Launch Date"

    invoke-virtual {v7, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1570
    const-string v11, "First App Launch"

    const-string v12, "True"

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1571
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    const-string v12, "First App Launch Date"

    invoke-interface {v11, v12, v6}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 1581
    .end local v4    # "editor":Landroid/content/SharedPreferences$Editor;
    .end local v5    # "firstDate":Ljava/text/SimpleDateFormat;
    .end local v6    # "firstLaunchDate":Ljava/lang/String;
    :goto_2
    :try_start_1
    const-string v11, "Hour of Day"

    const/16 v12, 0xb

    invoke-virtual {v1, v12}, Ljava/util/Calendar;->get(I)I

    move-result v12

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1582
    const-string v11, "Min of Hour"

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1583
    const-string v11, "Day of Week"

    invoke-virtual {v7, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1584
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    const-string v12, "Hour of Day"

    const/16 v13, 0xb

    invoke-virtual {v1, v13}, Ljava/util/Calendar;->get(I)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1589
    :goto_3
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperProperties(Lorg/json/JSONObject;)V

    .line 1590
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    const-string v12, "Launch"

    invoke-virtual {v11, v12, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto/16 :goto_1

    .line 1576
    :cond_2
    :try_start_2
    const-string v11, "First App Launch"

    const-string v12, "False"

    invoke-virtual {v7, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    .line 1577
    :catch_0
    move-exception v11

    goto :goto_2

    .line 1585
    :catch_1
    move-exception v3

    .line 1586
    .local v3, "e":Lorg/json/JSONException;
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3

    .line 1593
    .end local v3    # "e":Lorg/json/JSONException;
    .end local v7    # "launchProps":Lorg/json/JSONObject;
    :pswitch_1
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 1594
    .local v8, "resumeProps":Lorg/json/JSONObject;
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 1596
    .local v9, "resumeSuperProps":Lorg/json/JSONObject;
    :try_start_3
    const-string v11, "Hour of Day"

    const/16 v12, 0xb

    invoke-virtual {v1, v12}, Ljava/util/Calendar;->get(I)I

    move-result v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1597
    const-string v11, "Min of Hour"

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1598
    const-string v11, "Day of Week"

    invoke-virtual {v8, v11, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1600
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v11}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 1601
    .restart local v4    # "editor":Landroid/content/SharedPreferences$Editor;
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v12, "AppOpens"

    const/4 v13, 0x0

    invoke-interface {v11, v12, v13}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    add-int/lit8 v0, v11, 0x1

    .line 1602
    .local v0, "appOpens":I
    const-string v11, "Total App Opens"

    invoke-virtual {v8, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1603
    const-string v11, "Total App Opens"

    invoke-virtual {v9, v11, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1604
    const-string v11, "AppOpens"

    invoke-interface {v4, v11, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1605
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1607
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getPeople()Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;

    move-result-object v11

    const-string v12, "Total App Opens"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v11, v12, v13}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;->set(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    .line 1611
    .end local v0    # "appOpens":I
    .end local v4    # "editor":Landroid/content/SharedPreferences$Editor;
    :goto_4
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    const-string v12, "App Opened"

    invoke-virtual {v11, v12, v8}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->track(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1612
    iget-object v11, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v11, v9}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperProperties(Lorg/json/JSONObject;)V

    goto/16 :goto_1

    .line 1609
    :catch_2
    move-exception v11

    goto :goto_4

    .line 1572
    .end local v8    # "resumeProps":Lorg/json/JSONObject;
    .end local v9    # "resumeSuperProps":Lorg/json/JSONObject;
    .restart local v4    # "editor":Landroid/content/SharedPreferences$Editor;
    .restart local v5    # "firstDate":Ljava/text/SimpleDateFormat;
    .restart local v7    # "launchProps":Lorg/json/JSONObject;
    :catch_3
    move-exception v11

    goto/16 :goto_2

    .line 1551
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public checkVersion(ILjava/lang/String;)V
    .locals 6
    .param p1, "androidVersion"    # I
    .param p2, "serverStatus"    # Ljava/lang/String;

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 463
    const-string v3, "NONE"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 464
    iget v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->resumeCounter:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->resumeCounter:I

    .line 465
    :cond_0
    iput v4, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->VERSION:I

    .line 466
    const-string v3, "FULL"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 467
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 468
    .local v2, "intent":Landroid/content/Intent;
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 469
    .local v0, "b":Landroid/os/Bundle;
    const-string v3, "nav"

    invoke-virtual {v0, v3, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 470
    const-string v3, "key"

    const-string v4, "http://www.nbc.com/the-voice/redirect"

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    const-string v3, "phase"

    const-string v4, " "

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    invoke-virtual {v2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 473
    invoke-virtual {p0, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 474
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->finish()V

    .line 492
    .end local v0    # "b":Landroid/os/Bundle;
    .end local v2    # "intent":Landroid/content/Intent;
    :cond_1
    :goto_0
    return-void

    .line 477
    :cond_2
    iget v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->resumeCounter:I

    if-gt v3, v5, :cond_3

    const-string v3, "NONE"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 478
    invoke-direct {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->createWebView()V

    .line 481
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->VERSION:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 485
    :goto_1
    iget v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->VERSION:I

    if-le p1, v3, :cond_1

    .line 486
    const-string v3, "WebLog"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "checkVersion - Update your app, minimum required version: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 487
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v3}, Landroid/webkit/WebView;->stopLoading()V

    .line 488
    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    const-string v4, "about:blank"

    invoke-virtual {v3, v4}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 489
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showUpdateDialog()V

    goto :goto_0

    .line 482
    :catch_0
    move-exception v1

    .line 483
    .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_1
.end method

.method public getConnectionStatus(Landroid/content/Context;)Z
    .locals 4
    .param p1, "ctx"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 496
    const-string v3, "connectivity"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 497
    .local v0, "cMgr":Landroid/net/ConnectivityManager;
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 498
    .local v1, "i":Landroid/net/NetworkInfo;
    if-nez v1, :cond_1

    .line 504
    :cond_0
    :goto_0
    return v2

    .line 500
    :cond_1
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 502
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 504
    const/4 v2, 0x1

    goto :goto_0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 4

    .prologue
    .line 509
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 510
    .local v0, "manufacturer":Ljava/lang/String;
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 512
    .local v1, "model":Ljava/lang/String;
    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    or-int/2addr v2, v3

    if-eqz v2, :cond_0

    .line 513
    const-string v2, "\""

    const-string v3, "\\\""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 514
    const-string v2, "\'"

    const-string v3, "\\\'"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 517
    :cond_0
    const-string v2, "\'"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "\""

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    or-int/2addr v2, v3

    if-eqz v2, :cond_1

    .line 518
    const-string v2, "\""

    const-string v3, "\\\""

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 519
    const-string v2, "\'"

    const-string v3, "\\\'"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 522
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 523
    invoke-direct {p0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 525
    :goto_0
    return-object v2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 531
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v3, v3, v2}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 532
    .local v0, "timeZone":Ljava/lang/String;
    return-object v0
.end method

.method protected handleFacebookShare(Ljava/lang/String;)V
    .locals 16
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 780
    const-string v5, ""

    .line 781
    .local v5, "link":Ljava/lang/String;
    const-string v9, ""

    .line 782
    .local v9, "picture":Ljava/lang/String;
    const-string v7, ""

    .line 783
    .local v7, "name":Ljava/lang/String;
    const-string v2, ""

    .line 786
    .local v2, "description":Ljava/lang/String;
    :try_start_0
    const-string v13, "?"

    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p1

    invoke-virtual {v0, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 787
    .local v12, "strippedURL":Ljava/lang/String;
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 788
    .local v1, "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 790
    .local v4, "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v13, "&"

    invoke-virtual {v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    array-length v15, v14

    const/4 v13, 0x0

    :goto_0
    if-lt v13, v15, :cond_1

    .line 793
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_2

    .line 801
    const-string v13, "link"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    .line 802
    const-string v13, "picture"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v9, v0

    .line 803
    const-string v13, "name"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v7, v0

    .line 804
    const-string v13, "description"

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v2, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 809
    .end local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v12    # "strippedURL":Ljava/lang/String;
    :goto_2
    new-instance v13, Lcom/facebook/share/model/ShareLinkContent$Builder;

    invoke-direct {v13}, Lcom/facebook/share/model/ShareLinkContent$Builder;-><init>()V

    invoke-virtual {v13, v7}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentTitle(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v13

    invoke-virtual {v13, v2}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentDescription(Ljava/lang/String;)Lcom/facebook/share/model/ShareLinkContent$Builder;

    move-result-object v13

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/facebook/share/model/ShareLinkContent$Builder;->setContentUrl(Landroid/net/Uri;)Lcom/facebook/share/model/ShareContent$Builder;

    move-result-object v13

    check-cast v13, Lcom/facebook/share/model/ShareLinkContent$Builder;

    invoke-virtual {v13}, Lcom/facebook/share/model/ShareLinkContent$Builder;->build()Lcom/facebook/share/model/ShareLinkContent;

    move-result-object v6

    .line 810
    .local v6, "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/nbcuni/nbc/thevoice/MainActivity;->shareDialog:Lcom/facebook/share/widget/ShareDialog;

    invoke-virtual {v13, v6}, Lcom/facebook/share/widget/ShareDialog;->show(Ljava/lang/Object;)V

    .line 812
    return-void

    .line 790
    .end local v6    # "linkContent":Lcom/facebook/share/model/ShareLinkContent;
    .restart local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .restart local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .restart local v12    # "strippedURL":Ljava/lang/String;
    :cond_1
    :try_start_1
    aget-object v8, v14, v13

    .line 791
    .local v8, "param":Ljava/lang/String;
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 793
    .end local v8    # "param":Ljava/lang/String;
    :cond_2
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 795
    .local v11, "str":Ljava/lang/String;
    const-string v14, "="

    invoke-virtual {v11, v14}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 796
    .local v10, "splitParam":[Ljava/lang/String;
    array-length v14, v10

    const/4 v15, 0x2

    if-ne v14, v15, :cond_0

    .line 797
    const/4 v14, 0x0

    aget-object v14, v10, v14

    const/4 v15, 0x1

    aget-object v15, v10, v15

    invoke-static {v15}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 805
    .end local v1    # "URLParams":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    .end local v4    # "facebookParams":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v10    # "splitParam":[Ljava/lang/String;
    .end local v11    # "str":Ljava/lang/String;
    .end local v12    # "strippedURL":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 806
    .local v3, "e":Ljava/lang/Exception;
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 817
    invoke-super {p0, p1, p2, p3}, Lcom/comscore/instrumentation/InstrumentedActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 818
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->callbackManager:Lcom/facebook/CallbackManager;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    .line 819
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 824
    invoke-super {p0, p1}, Lcom/comscore/instrumentation/InstrumentedActivity;->onCreate(Landroid/os/Bundle;)V

    .line 825
    sput-boolean v10, Lcom/nbcuni/nbc/thevoice/MainActivity;->popupOpened:Z

    .line 826
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/adobe/mobile/Config;->setContext(Landroid/content/Context;)V

    .line 827
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/comscore/analytics/comScore;->setAppContext(Landroid/content/Context;)V

    .line 828
    const-string v6, "PushPreferences"

    invoke-virtual {p0, v6, v10}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    .line 830
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "077d27b869b0ce2fda8e02f7f37cc5a2"

    invoke-static {v6, v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    move-result-object v6

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    .line 831
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 833
    .local v3, "js":Lorg/json/JSONObject;
    :try_start_0
    const-string v6, "campaign"

    const-string v7, "Organic"

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 836
    :goto_0
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v6, v3}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->registerSuperPropertiesOnce(Lorg/json/JSONObject;)V

    .line 837
    invoke-direct {p0, v9}, Lcom/nbcuni/nbc/thevoice/MainActivity;->setMixPanelProperties(I)V

    .line 839
    new-instance v0, Lcom/nbcuni/nbc/thevoice/MainActivity$11;

    invoke-direct {v0, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$11;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    .line 860
    .local v0, "callback":Landroid/os/Handler;
    invoke-static {v0}, Lcom/kochava/android/tracker/Feature;->setAttributionHandler(Landroid/os/Handler;)V

    .line 862
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 864
    .local v2, "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v6, "kochava_app_id"

    const-string v7, "kothe-voice----android53ff5a272245b"

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    const-string v6, "request_attribution"

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 866
    const-string v6, "internalUserId"

    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v7}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->getDistinctId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    new-instance v4, Lcom/kochava/android/tracker/Feature;

    invoke-direct {v4, p0, v2}, Lcom/kochava/android/tracker/Feature;-><init>(Landroid/content/Context;Ljava/util/HashMap;)V

    .line 870
    .local v4, "kTracker":Lcom/kochava/android/tracker/Feature;
    if-eqz p1, :cond_0

    .line 871
    const-string v6, "splashShown"

    invoke-virtual {p1, v6, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    iput-boolean v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->splashShown:Z

    .line 874
    :cond_0
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v7, "push"

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_1

    .line 875
    invoke-static {}, Lcom/urbanairship/push/PushManager;->disablePush()V

    .line 878
    :cond_1
    const-string v6, "power"

    invoke-virtual {p0, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/os/PowerManager;

    .line 879
    .local v5, "pm":Landroid/os/PowerManager;
    const/4 v6, 0x6

    const-string v7, "NoTurningOff"

    invoke-virtual {v5, v6, v7}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v6

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->wl:Landroid/os/PowerManager$WakeLock;

    .line 880
    invoke-virtual {p0, v9}, Lcom/nbcuni/nbc/thevoice/MainActivity;->requestWindowFeature(I)Z

    .line 881
    const/high16 v6, 0x7f030000

    invoke-virtual {p0, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->setContentView(I)V

    .line 882
    const v6, 0x7f09002c

    invoke-virtual {p0, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/webkit/WebView;

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    .line 884
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/facebook/FacebookSdk;->sdkInitialize(Landroid/content/Context;)V

    .line 886
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v6

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->callbackManager:Lcom/facebook/CallbackManager;

    .line 887
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v6

    iget-object v7, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->callbackManager:Lcom/facebook/CallbackManager;

    new-instance v8, Lcom/nbcuni/nbc/thevoice/MainActivity$12;

    invoke-direct {v8, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$12;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v6, v7, v8}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 916
    new-instance v6, Lcom/facebook/share/widget/ShareDialog;

    invoke-direct {v6, p0}, Lcom/facebook/share/widget/ShareDialog;-><init>(Landroid/app/Activity;)V

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->shareDialog:Lcom/facebook/share/widget/ShareDialog;

    .line 918
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v1

    .line 919
    .local v1, "cookieManager":Landroid/webkit/CookieManager;
    if-eqz v1, :cond_2

    .line 920
    invoke-virtual {v1}, Landroid/webkit/CookieManager;->removeSessionCookie()V

    .line 922
    :cond_2
    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->OSVersion:Ljava/lang/String;

    .line 924
    const-string v6, "audio\', \'noTelephony"

    iput-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->deviceCapability:Ljava/lang/String;

    .line 926
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    const/high16 v7, -0x1000000

    invoke-virtual {v6, v7}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 927
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v6, v10}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 929
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    invoke-virtual {p0, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getConnectionStatus(Landroid/content/Context;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 930
    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    const-string v7, "about:blank"

    invoke-virtual {v6, v7}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 931
    iput-boolean v9, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 932
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->showConnectionDialog()V

    .line 935
    :cond_3
    return-void

    .line 834
    .end local v0    # "callback":Landroid/os/Handler;
    .end local v1    # "cookieManager":Landroid/webkit/CookieManager;
    .end local v2    # "datamap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v4    # "kTracker":Lcom/kochava/android/tracker/Feature;
    .end local v5    # "pm":Landroid/os/PowerManager;
    :catch_0
    move-exception v6

    goto/16 :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 538
    invoke-virtual {p0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0d0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 539
    const/4 v0, 0x0

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 940
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mixpanel:Lcom/mixpanel/android/mpmetrics/MixpanelAPI;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI;->flush()V

    .line 941
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onDestroy()V

    .line 942
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->httpTask:Landroid/os/AsyncTask;

    if-eqz v0, :cond_0

    .line 943
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->httpTask:Landroid/os/AsyncTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 944
    :cond_0
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_1

    .line 945
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->loadTimer:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    .line 946
    :cond_1
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    .line 947
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 948
    :cond_2
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_3

    .line 949
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 950
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 953
    :cond_3
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v2, 0x0

    .line 546
    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    .line 552
    :goto_0
    return v2

    .line 549
    :cond_0
    const-string v0, "{\"type\":\"Event\",\"subject\":\"BackButton\"}"

    .line 550
    .local v0, "backString":Ljava/lang/String;
    const-string v1, "{\"type\":\"Event\",\"subject\":\"BackButton\"}"

    invoke-virtual {p0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 958
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 959
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 960
    :cond_0
    const-string v0, "{\"type\":\"Event\",\"subject\":\"AppPause\"}"

    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->sendMessageToJS(Ljava/lang/String;)V

    .line 961
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 962
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    .line 963
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 964
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPaused:Z

    .line 965
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 967
    :cond_1
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onPause()V

    .line 968
    invoke-static {}, Lcom/adobe/mobile/Config;->pauseCollectingLifecycleData()V

    .line 969
    return-void
.end method

.method protected onResume()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 974
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onResume()V

    .line 975
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-nez v0, :cond_0

    .line 976
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->wl:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 977
    :cond_0
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 978
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V

    .line 979
    iget-boolean v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPaused:Z

    if-eqz v0, :cond_1

    .line 980
    iput-boolean v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPaused:Z

    .line 981
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 983
    :cond_1
    new-instance v0, Lcom/nbcuni/nbc/thevoice/HTTPTask;

    invoke-direct {v0, p0}, Lcom/nbcuni/nbc/thevoice/HTTPTask;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, ""

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/nbcuni/nbc/thevoice/HTTPTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    iput-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->httpTask:Landroid/os/AsyncTask;

    .line 984
    invoke-static {}, Lcom/adobe/mobile/Config;->collectLifecycleData()V

    .line 986
    iget v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->resumeCounter:I

    if-lt v0, v4, :cond_2

    .line 987
    invoke-direct {p0, v4}, Lcom/nbcuni/nbc/thevoice/MainActivity;->setMixPanelProperties(I)V

    .line 989
    :cond_2
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v1, "expiryDate"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 990
    iget-object v0, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "javascript: window.localStorage.setItem(\"age_gate\", JSON.stringify("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->sharedPrefs:Landroid/content/SharedPreferences;

    const-string v3, "expiryDate"

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "));"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 994
    :cond_3
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 999
    const-string v0, "splashShown"

    iget-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->splashShown:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1000
    invoke-super {p0, p1}, Lcom/comscore/instrumentation/InstrumentedActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1001
    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    .line 1006
    iget-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->splashShown:Z

    if-nez v1, :cond_0

    .line 1008
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/nbcuni/nbc/thevoice/VideoSplash;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1009
    .local v0, "intent":Landroid/content/Intent;
    invoke-virtual {p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1010
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->splashShown:Z

    .line 1013
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onStart()V

    .line 1014
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 1019
    invoke-super {p0}, Lcom/comscore/instrumentation/InstrumentedActivity;->onStop()V

    .line 1020
    return-void
.end method

.method public sendBackendData(Ljava/lang/String;Lorg/json/JSONObject;JLjava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "json"    # Lorg/json/JSONObject;
    .param p3, "currentTime"    # J
    .param p5, "timeZone"    # Ljava/lang/String;

    .prologue
    .line 557
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendUrl:Ljava/lang/String;

    .line 558
    iput-object p2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendResponse:Lorg/json/JSONObject;

    .line 559
    iput-object p5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->backendTimeZone:Ljava/lang/String;

    .line 560
    iput-wide p3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->gatekeeperTimestamp:J

    .line 561
    return-void
.end method

.method public sendMessageToJS(Ljava/lang/String;)V
    .locals 3
    .param p1, "string"    # Ljava/lang/String;

    .prologue
    .line 565
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nativeWrapper.onMessage(JSON.parse(\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\'))"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 566
    .local v0, "jsCommand":Ljava/lang/String;
    new-instance v1, Lcom/nbcuni/nbc/thevoice/MainActivity$3;

    invoke-direct {v1, p0, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity$3;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/nbcuni/nbc/thevoice/MainActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 576
    return-void
.end method

.method public showConnectionDialog()V
    .locals 5

    .prologue
    .line 580
    new-instance v2, Landroid/app/Dialog;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v4, 0x103000c

    invoke-direct {v2, v3, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    .line 581
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 582
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 583
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    const v3, 0x7f03000b

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setContentView(I)V

    .line 585
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    const v3, 0x7f090045

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 586
    .local v1, "title":Landroid/widget/TextView;
    const v2, 0x7f08005d

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 588
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    const v3, 0x7f090046

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 589
    .local v0, "text":Landroid/widget/TextView;
    const v2, 0x7f08005e

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 591
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->connectionDialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 592
    iget-object v2, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->broadcastReceiver:Landroid/content/BroadcastReceiver;

    iget-object v3, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->filter:Landroid/content/IntentFilter;

    invoke-virtual {p0, v2, v3}, Lcom/nbcuni/nbc/thevoice/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 593
    return-void
.end method

.method public showDNSDialog()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 597
    iget-boolean v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    if-nez v5, :cond_0

    .line 598
    iput-boolean v9, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    .line 599
    new-instance v5, Landroid/app/Dialog;

    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v7, 0x103000c

    invoke-direct {v5, v6, v7}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    .line 600
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    invoke-virtual {v5, v9}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 601
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    invoke-virtual {v5, v8}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 602
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    const v6, 0x7f03000c

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setContentView(I)V

    .line 604
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    const v6, 0x7f090045

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 605
    .local v4, "title":Landroid/widget/TextView;
    const v5, 0x7f08005f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 607
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    const v6, 0x7f090046

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 608
    .local v3, "text":Landroid/widget/TextView;
    const v5, 0x7f080060

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 610
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    const v6, 0x7f090047

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 611
    .local v0, "cancelButton":Landroid/widget/Button;
    invoke-virtual {v0, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 612
    const v5, 0x7f080053

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setText(I)V

    .line 613
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$4;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$4;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 625
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    const v6, 0x7f090048

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 626
    .local v2, "retryButton":Landroid/widget/Button;
    invoke-virtual {v2, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 627
    const v5, 0x7f080056

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(I)V

    .line 628
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$5;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$5;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 641
    :try_start_0
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialog:Landroid/app/Dialog;

    invoke-virtual {v5}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 647
    .end local v0    # "cancelButton":Landroid/widget/Button;
    .end local v2    # "retryButton":Landroid/widget/Button;
    .end local v3    # "text":Landroid/widget/TextView;
    .end local v4    # "title":Landroid/widget/TextView;
    :cond_0
    :goto_0
    return-void

    .line 642
    .restart local v0    # "cancelButton":Landroid/widget/Button;
    .restart local v2    # "retryButton":Landroid/widget/Button;
    .restart local v3    # "text":Landroid/widget/TextView;
    .restart local v4    # "title":Landroid/widget/TextView;
    :catch_0
    move-exception v1

    .line 643
    .local v1, "e":Landroid/view/WindowManager$BadTokenException;
    iput-boolean v8, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->DNSDialogActive:Z

    goto :goto_0
.end method

.method public showEndOfSeasonDialog()V
    .locals 8

    .prologue
    .line 651
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->webView:Landroid/webkit/WebView;

    const-string v6, "about:blank"

    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 652
    new-instance v5, Landroid/app/Dialog;

    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v7, 0x103000c

    invoke-direct {v5, v6, v7}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    .line 653
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 654
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 655
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f03000d

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setContentView(I)V

    .line 657
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f090045

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 658
    .local v4, "title":Landroid/widget/TextView;
    const v5, 0x7f080057

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 660
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f090049

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 661
    .local v2, "text2":Landroid/widget/TextView;
    const v5, 0x7f080058

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(I)V

    .line 663
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f09004a

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 664
    .local v3, "text3":Landroid/widget/TextView;
    const v5, 0x7f080059

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 666
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f090046

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 667
    .local v1, "text":Landroid/widget/TextView;
    const v5, 0x7f08005a

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 669
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    const v6, 0x7f090043

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 670
    .local v0, "fakeDialog":Landroid/widget/LinearLayout;
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$6;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$6;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 680
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->endOfShowDialog:Landroid/app/Dialog;

    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 681
    return-void
.end method

.method public showQuitDialog()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 685
    iget-boolean v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialogOpen:Z

    if-nez v5, :cond_0

    .line 686
    new-instance v5, Landroid/app/Dialog;

    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v7, 0x103000f

    invoke-direct {v5, v6, v7}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    .line 687
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    invoke-virtual {v5, v8}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 688
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 689
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f03000c

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setContentView(I)V

    .line 691
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f090042

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 692
    .local v0, "bg":Landroid/widget/RelativeLayout;
    const v5, 0x106000d

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 694
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f090045

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 695
    .local v4, "title":Landroid/widget/TextView;
    const v5, 0x7f080049

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 697
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f090046

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 698
    .local v3, "text":Landroid/widget/TextView;
    const v5, 0x7f080061

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 700
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f090047

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 701
    .local v1, "cancelButton":Landroid/widget/Button;
    const v5, 0x7f080055

    invoke-virtual {v1, v5}, Landroid/widget/Button;->setText(I)V

    .line 702
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$7;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$7;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v1, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 713
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    const v6, 0x7f090048

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 714
    .local v2, "quitButton":Landroid/widget/Button;
    const v5, 0x7f080054

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(I)V

    .line 715
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$8;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$8;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 728
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialog:Landroid/app/Dialog;

    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 729
    iput-boolean v8, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->quitDialogOpen:Z

    .line 731
    .end local v0    # "bg":Landroid/widget/RelativeLayout;
    .end local v1    # "cancelButton":Landroid/widget/Button;
    .end local v2    # "quitButton":Landroid/widget/Button;
    .end local v3    # "text":Landroid/widget/TextView;
    .end local v4    # "title":Landroid/widget/TextView;
    :cond_0
    return-void
.end method

.method public showUpdateDialog()V
    .locals 8

    .prologue
    .line 736
    new-instance v5, Landroid/app/Dialog;

    iget-object v6, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->context:Landroid/content/Context;

    const v7, 0x103000c

    invoke-direct {v5, v6, v7}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    .line 737
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 738
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 739
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const v6, 0x7f03000c

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->setContentView(I)V

    .line 741
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const v6, 0x7f090045

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 742
    .local v3, "title":Landroid/widget/TextView;
    const v5, 0x7f08005b

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(I)V

    .line 744
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const v6, 0x7f090046

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 745
    .local v1, "text":Landroid/widget/TextView;
    const v5, 0x7f08005c

    invoke-virtual {p0, v5}, Lcom/nbcuni/nbc/thevoice/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 747
    .local v2, "text1":Ljava/lang/String;
    invoke-static {v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 749
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const v6, 0x7f090047

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 750
    .local v0, "cancelButton":Landroid/widget/Button;
    const v5, 0x7f080053

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setText(I)V

    .line 751
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$9;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$9;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 762
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    const v6, 0x7f090048

    invoke-virtual {v5, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    .line 763
    .local v4, "updateButton":Landroid/widget/Button;
    const v5, 0x7f080052

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setText(I)V

    .line 764
    new-instance v5, Lcom/nbcuni/nbc/thevoice/MainActivity$10;

    invoke-direct {v5, p0}, Lcom/nbcuni/nbc/thevoice/MainActivity$10;-><init>(Lcom/nbcuni/nbc/thevoice/MainActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 774
    iget-object v5, p0, Lcom/nbcuni/nbc/thevoice/MainActivity;->updateDialog:Landroid/app/Dialog;

    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 776
    return-void
.end method
