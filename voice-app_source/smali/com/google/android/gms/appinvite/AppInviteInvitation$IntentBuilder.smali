.class public final Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/appinvite/AppInviteInvitation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IntentBuilder"
.end annotation


# static fields
.field public static final MAX_MESSAGE_LENGTH:I = 0x64

.field public static final PROJECT_PLATFORM_IOS:I = 0x1


# instance fields
.field private final mIntent:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 2
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.ACTION_APP_INVITE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.TITLE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public build()Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    return-object v0
.end method

.method public setAccount(Landroid/accounts/Account;)Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    .locals 2
    .param p1, "account"    # Landroid/accounts/Account;

    .prologue
    if-eqz p1, :cond_0

    const-string v0, "com.google"

    iget-object v1, p1, Landroid/accounts/Account;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.ACCOUNT_NAME"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.ACCOUNT_NAME"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setDeepLink(Landroid/net/Uri;)Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    .locals 2
    .param p1, "deepLink"    # Landroid/net/Uri;

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.DEEP_LINK_URL"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.DEEP_LINK_URL"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setGoogleAnalyticsTrackingId(Ljava/lang/String;)Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    .locals 2
    .param p1, "trackingId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.GOOGLE_ANALYTICS_TRACKING_ID"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method

.method public setMessage(Ljava/lang/CharSequence;)Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    .locals 5
    .param p1, "message"    # Ljava/lang/CharSequence;

    .prologue
    const/16 v4, 0x64

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-le v0, v4, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message must be %d chars or less."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.MESSAGE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    return-object p0
.end method

.method public setOtherPlatformsTargetApplication(ILjava/lang/String;)Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;
    .locals 2
    .param p1, "targetPlatform"    # I
    .param p2, "clientId"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appinvite/AppInviteInvitation$IntentBuilder;->mIntent:Landroid/content/Intent;

    const-string v1, "com.google.android.gms.appinvite.iosTargetApplication"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object p0
.end method
