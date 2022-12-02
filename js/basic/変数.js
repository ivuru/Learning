const button = document.querySelector('button');

button.onclick = function() {
  let name = prompt('あなたの名前は何ですか？');
  alert('こんにちは、' + name + 'さん、初めまして！');
}