package com.example.sky.afinal.view.Login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.sky.afinal.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ForgotPass extends AppCompatActivity {
    @Bind(R.id.activity_login)
    TextView tv_login;
    @Bind(R.id.button_login)
    Button btn_login;
    /*
    BuffeKnife affect

    Co the them tuy y' = cach cung cap view
     @BindView(R.id.button1) Button button1;
  @BindView(R.id.button2) Button button2;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fancy_fragment, container, false);
    ButterKnife.bind(this, view);
    // TODO Use fields...
    return view;
     */
    /*
    Gop cac view voi nhau
    @BindViews({ R.id.first_name, R.id.middle_name, R.id.last_name })
List<EditText> nameViews;

The apply method allows you to act on all the views in a list at once.
ButterKnife.apply(nameViews, DISABLE);
ButterKnife.apply(nameViews, ENABLED, false);
     */

    /*
    Kich hoat hoac thay doi cac interface
    static final ButterKnife.Action<View> DISABLE = new ButterKnife.Action<View>() {
  @Override public void apply(View view, int index) {
    view.setEnabled(false);
  }
};
static final ButterKnife.Setter<View, Boolean> ENABLED = new ButterKnife.Setter<View, Boolean>() {
  @Override public void set(View view, Boolean value, int index) {
    view.setEnabled(value);
  }
};
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
        ButterKnife.bind(this);
    }

    /*
    Tự Động lắng nghe các sự kiện

    @OnClick(R.id.submit)
public void sayHi(Button button) {
  button.setText("Hello!");
}

@OnItemSelected(R.id.list_view)
void onItemSelected(int position) {
  // TODO ...
}
     */

    /*
    Cụ thể nhiều ID trong 1 dòng:

    @OnClick({ R.id.door1, R.id.door2, R.id.door3 })
public void pickDoor(DoorView door) {
  if (door.hasPrizeBehind()) {
    Toast.makeText(this, "You win!", LENGTH_SHORT).show();
  } else {
    Toast.makeText(this, "Try again", LENGTH_SHORT).show();
  }
}
     */

    /*
    Dừng các view trong vòng đời

    public class FancyFragment extends Fragment {
  @BindView(R.id.button1) Button button1;
  @BindView(R.id.button2) Button button2;
  private Unbinder unbinder;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fancy_fragment, container, false);
    unbinder = ButterKnife.bind(this, view);
    // TODO Use fields...
    return view;
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    unbinder.unbind();
  }
}

     */
}
