.class Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;
.super Ljava/lang/Object;
.source "DecideChecker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mixpanel/android/mpmetrics/DecideChecker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Result"
.end annotation


# instance fields
.field public eventBindings:Lorg/json/JSONArray;

.field public final notifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/InAppNotification;",
            ">;"
        }
    .end annotation
.end field

.field public final surveys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mixpanel/android/mpmetrics/Survey;",
            ">;"
        }
    .end annotation
.end field

.field public variants:Lorg/json/JSONArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->surveys:Ljava/util/List;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->notifications:Ljava/util/List;

    .line 36
    # getter for: Lcom/mixpanel/android/mpmetrics/DecideChecker;->EMPTY_JSON_ARRAY:Lorg/json/JSONArray;
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->access$0()Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->eventBindings:Lorg/json/JSONArray;

    .line 37
    # getter for: Lcom/mixpanel/android/mpmetrics/DecideChecker;->EMPTY_JSON_ARRAY:Lorg/json/JSONArray;
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/DecideChecker;->access$0()Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/DecideChecker$Result;->variants:Lorg/json/JSONArray;

    .line 38
    return-void
.end method
