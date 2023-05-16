
<template>
  <div class="container_login">
    <div class="modal_login">
      <div class="wrapper_login">
        <div>
          <label>아이디</label><br>
          <input type="text" v-model="userId" />
        </div>
        <div :style="`margin-bottom: 10px`">
          <label>비밀번호</label><br>
          <input type="text" v-model="userPw" />
        </div>
        <button>
          <span :style="`margin-top:2px`">로그인</span>
        </button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Login',

  data: function () {
    return {
      userId: '아이디를 입력해주세요.',
      userPw: '비밀번호를 입력해주세요.'
    }
  }
}
</script>