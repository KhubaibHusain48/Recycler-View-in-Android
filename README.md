
# RecyclerView Practice 

This Android project demonstrates how to use a `RecyclerView` to display a list of custom items using a custom `Adapter` and `ViewHolder` pattern. The app shows a list of contacts, each with an image, name, and phone number.

## 📱 Features

- Displays a list of contacts in a modern `CardView` layout.
- Implements `RecyclerView` with a custom adapter (`RecyclerAdapter`).
- Each item includes:
  - Contact image
  - Contact name
  - Contact number
- Clean, responsive UI using `CardView` and `LinearLayout`.


## 🛠️ Usage

1. Clone or download this repository.
2. Open the project in **Android Studio**.
3. Add your drawable images (a.png, b.png, etc.) into `res/drawable`.
4. Build and run the project on an emulator or physical Android device.

## 📂 Important Files

### `MainActivity.java`

- Creates an `ArrayList<DataClass>` for contact data.
- Sets up the `RecyclerView` and attaches the `RecyclerAdapter`.

### `RecyclerAdapter.java`

- Binds contact data (image, name, number) to the UI using `ViewHolder`.

### `DataClass.java`

- Simple data model holding:
  - `int image`
  - `String name`
  - `String num`

### `activity_structure.xml`

- Custom layout used for each card item inside the `RecyclerView`.

### `activity_main.xml`

- Contains the `RecyclerView` within a vertical `LinearLayout`.

## 🧪 Example Contacts

| Image | Name     | Number  |
|-------|----------|---------|
| 🟢    | Khubaib  | 1234    |
| 🔵    | Salman   | 134312  |
| 🟠    | Ismaeel  | 21321   |
| 🟣    | Junaid   | 43543   |
| 🔴    | Bilal    | 7854    |
| 🟡    | Huzaifa  | 24512`  |
| 🟤    | Ammar    | 68972   |

## 📌 Notes

- The layout used in both `MainActivity` and `RecyclerAdapter` is currently the same (`activity_structure.xml`). For best practice, create a **separate layout** (e.g., `item_contact.xml`) for `RecyclerView` items.
- Make sure all image resources referenced (like `R.drawable.a`) exist in the `drawable/` folder.



**Author**: Khubaib Husain  
**Technologies**: Java, Android SDK, RecyclerView, CardView, XML Layouts

