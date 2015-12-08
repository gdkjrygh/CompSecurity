.class Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;
.super Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;
.source "MixpanelAPI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;->withIdentity(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/MixpanelAPI$People;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

.field private final synthetic val$distinctId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;->this$1:Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;

    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;->val$distinctId:Ljava/lang/String;

    .line 1703
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;-><init>(Lcom/mixpanel/android/mpmetrics/MixpanelAPI;Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl;)V

    return-void
.end method


# virtual methods
.method public getDistinctId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1706
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/MixpanelAPI$PeopleImpl$2;->val$distinctId:Ljava/lang/String;

    return-object v0
.end method

.method public identify(Ljava/lang/String;)V
    .locals 2
    .param p1, "distinctId"    # Ljava/lang/String;

    .prologue
    .line 1711
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "This MixpanelPeople object has a fixed, constant distinctId"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
