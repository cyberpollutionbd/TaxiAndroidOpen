//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.models.RequestCView;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class RequestsActivity_
    extends RequestsActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.requests);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static RequestsActivity_.IntentBuilder_ intent(Context context) {
        return new RequestsActivity_.IntentBuilder_(context);
    }

    public static RequestsActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new RequestsActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        pbProgress = ((ProgressBar) hasViews.findViewById(id.pbProgress));
        requests_table = ((TableLayout) hasViews.findViewById(id.requests_table));
        {
            View view = hasViews.findViewById(id.backButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestsActivity_.this.backButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.requestsHistory);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestsActivity_.this.requestsHistory();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.newRequests);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        RequestsActivity_.this.newRequests();
                    }

                }
                );
            }
        }
        afterRequestsActivity();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case  100 :
                RequestsActivity_.this.onResult();
                break;
        }
    }

    @Override
    public void showRequests(final RequestCView requests) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                RequestsActivity_.super.showRequests(requests);
            }

        }
        );
    }

    @Override
    public void setActivityTile(final String title) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                RequestsActivity_.super.setActivityTile(title);
            }

        }
        );
    }

    @Override
    public void getRequestHistory() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    RequestsActivity_.super.getRequestHistory();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void getRequests() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    RequestsActivity_.super.getRequests();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void scheduleRequestSec() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 1000, "") {


            @Override
            public void execute() {
                try {
                    RequestsActivity_.super.scheduleRequestSec();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void scheduleRequest() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 10000, "") {


            @Override
            public void execute() {
                try {
                    RequestsActivity_.super.scheduleRequest();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, RequestsActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, RequestsActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public RequestsActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

    }

}
