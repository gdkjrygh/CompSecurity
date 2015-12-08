.class public interface abstract Lcom/nbcuni/nbc/thevoice/PopupJSListener;
.super Ljava/lang/Object;
.source "PopupJSListener.java"


# virtual methods
.method public abstract closePopup()V
.end method

.method public abstract facebookLogin(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract facebookLogout(Ljava/lang/String;)V
.end method

.method public abstract facebookPermissionRequest(Ljava/lang/String;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract facebookShare(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract hideLoadingScreen()V
.end method

.method public abstract passExpiresValue(Ljava/lang/String;)V
.end method
