import { Link, RouterProvider, createBrowserRouter } from "react-router-dom";
import LoginPage from "./page/LoginPage";
import RegisterPage from "./page/RegisterPage";
import Layout from "./components/layout/Layout";
import AuthLayout from "./components/layout/AuthLayout";
import Logout from "./components/auth/Logout";

function App() {

  const unauthlayout = createBrowserRouter(
    [{
      path: "/",
      element: <Layout/> ,
      children: [

        {
          path: "/",
          element: (
            <Link to='/login'>Login</Link>
          )
        },
        {
          path: "/login",
          element: ( <LoginPage/>
          )
        },
        {
          path: "/register",
          element: (
            <RegisterPage/>
          )
        },
        {
          path: "*",
          element: (
            "Not Found"
          )
        }
      ]
    }]
  );

  const authRouter = createBrowserRouter(
    [{
      path: "/",
      element: <AuthLayout/> ,
      children: [
        {
          path: "/",
          element: (<Logout/>)
        },
        {
          path: "*",
          element: (
            "Not Found"
          )
        }
      ]
    }]
  );
  return (
    <div className="App">
      { localStorage.getItem('token') !== null ? <RouterProvider router={authRouter} /> : <RouterProvider router={unauthlayout} />}
    </div>
  );
}

export default App;
