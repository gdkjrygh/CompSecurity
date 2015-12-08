.class Lcom/kochava/android/tracker/Feature$2;
.super Landroid/os/AsyncTask;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->init(Landroid/content/Context;ZLjava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 467
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$2;->this$0:Lcom/kochava/android/tracker/Feature;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 467
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/kochava/android/tracker/Feature$2;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 3
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 472
    const/4 v1, 0x0

    .line 475
    .local v1, "token":Ljava/lang/String;
    :try_start_0
    iget-object v2, p0, Lcom/kochava/android/tracker/Feature$2;->this$0:Lcom/kochava/android/tracker/Feature;

    # invokes: Lcom/kochava/android/tracker/Feature;->getAdvertisingId()Ljava/lang/String;
    invoke-static {v2}, Lcom/kochava/android/tracker/Feature;->access$000(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 482
    :goto_0
    return-object v1

    .line 477
    :catch_0
    move-exception v0

    .line 479
    .local v0, "e":Ljava/lang/Error;
    const-string v2, "*****NOTICE***** \nAn error has occured when trying to gather the Google Advertising Id. Please make sure you have the Google Play Services Library integrated in your app! \n*****NOTICE*****"

    invoke-static {v2}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 467
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/kochava/android/tracker/Feature$2;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1
    .param p1, "token"    # Ljava/lang/String;

    .prologue
    .line 488
    # setter for: Lcom/kochava/android/tracker/Feature;->advertisingID:Ljava/lang/String;
    invoke-static {p1}, Lcom/kochava/android/tracker/Feature;->access$102(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    const-string v0, "ADID retrevial finished and gathered if available."

    invoke-static {v0}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 490
    return-void
.end method
