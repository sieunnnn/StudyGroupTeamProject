
<template>
  <ModalFormA class="container_signup">
    <template #contents>
      <form class="wrapper_signup">
        <div :style="`margin-top: 50px`">
          <label>이메일</label><br>
          <input type="text" v-model="signup.email" />
        </div>
        <div>
          <label>비밀번호</label><br>
          <input type="text" v-model="signup.password" />
        </div>
        <div :style="`margin-bottom: 15px`">
          <label>닉네임</label><br>
          <input type="text" v-model="signup.nickname" />
        </div>
        <button>
          <span @click="signup.submit()" :disabled="!signup.canSignup" :style="`margin-top: 2px`">회원가입</span>
        </button>
      </form>
    </template>
  </ModalFormA>
</template>

<script>
import ModalFormA from "@/components/modal/ModalFormA";
import { useSignupStore } from "@/store/signup";

export default {
  setup() {
    const signup = useSignupStore();
    return {
      signup: signup
    }
  },

  name: 'SignUp',

  components: {
    ModalFormA
  }
}
</script>